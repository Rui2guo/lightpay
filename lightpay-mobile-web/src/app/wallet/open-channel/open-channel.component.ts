import { Component, OnInit } from '@angular/core';
import { PageBaseComponent } from 'app/paging/page-base.component';

@Component({
  selector: 'lp-open-channel',
  templateUrl: './open-channel.component.html',
  styleUrls: ['./open-channel.component.scss']
})
export class OpenChannelComponent extends PageBaseComponent implements OnInit {

  constructor() {
    super();
  }

  ngOnInit() {
  }

}
