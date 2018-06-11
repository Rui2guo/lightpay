import { Component, OnInit, AfterViewInit, OnDestroy } from '@angular/core';
import { PageBaseComponent } from 'app/paging/page-base.component';
import { FormControl, FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Subscription } from 'rxjs';
import { NetworkActionService } from '../../../common/services/action/network-action.service';
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { Payload } from 'app/common/base/emitter';
import { _ } from 'app';
import { ChannelListComponent } from 'app/wallet/channel-list/channel-list.component';

@Component({
  selector: 'lp-open-channel',
  templateUrl: './open-channel.component.html',
  styleUrls: ['./open-channel.component.scss']
})
export class OpenChannelComponent extends PageBaseComponent implements OnInit, AfterViewInit, OnDestroy {

  connectFormGroup: FormGroup;

  numSatoshisView: number = 0;

  buttonDisabled: boolean = true;

  connecting: boolean = false;

  private inputSatoshis: string = "";

  private registerId: string;

  private emitId: string;

  private changeSubscription: Subscription;

  constructor(
    private dispatcherService: DispatcherService,
    private networkActionService: NetworkActionService,
    private formBuilder: FormBuilder
  ) {
    super();

    this.connectFormGroup = formBuilder.group({
      host: ['', Validators.compose([Validators.required, Validators.pattern(/^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$/)])],
      port: ['', Validators.compose([Validators.required, Validators.pattern(/^[1-9][0-9]*$/)])],
      pubkey: ['', Validators.required]
    });
  }

  ngOnInit() {
    this.registerId = this.dispatcherService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case NetworkActionService.OPEN_CHANNEL_EVENT:
            this.onConnect(payload);
            break;
        }
      }
    );
  }

  ngAfterViewInit() {
    this.changeSubscription = this.connectFormGroup.valueChanges.subscribe(
      () => { 
        this.onChangeForm();
      }
    );
  }

  ngOnDestroy() {
    this.dispatcherService.unregister(this.registerId);
    this.changeSubscription.unsubscribe();
  }

  onInputNum(numStr: string) {
    if (numStr === "del") {
      this.inputSatoshis = this.inputSatoshis.substring(0, this.inputSatoshis.length - 1);
    } else {
      this.inputSatoshis = this.inputSatoshis.concat(numStr);
    }

    this.numSatoshisView = Number(this.inputSatoshis);
    if (this.numSatoshisView === 0) {
      this.inputSatoshis = "";
    }

    this.onChangeForm();
  }

  onChangeForm() {
    if (this.numSatoshisView < 20000) {
      this.buttonDisabled = true;
      return;
    }

    if (!this.connectFormGroup.valid) {
      this.buttonDisabled = true;
      return;
    }

    this.buttonDisabled = false;
  }

  onSubmit() {
    this.connecting = true;
    this.emitId = this.networkActionService.openChannel(
      this.connectFormGroup.value.pubkey,
      this.connectFormGroup.value.host,
      Number(this.connectFormGroup.value.port),
      this.numSatoshisView
    );
  }

  private onConnect(payload: Payload) {
    if (_.isEmpty(payload.emitId) || payload.emitId !== this.emitId) {
      return;
    }

    this.dispatcherService.emit({ eventType: ChannelListComponent.CLOSE_OPEN_CHANNEL_PAGE_EVENT });
  }

}
