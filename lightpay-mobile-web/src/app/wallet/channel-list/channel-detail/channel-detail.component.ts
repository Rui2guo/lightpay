import { Component, OnInit } from '@angular/core';
import { PageBaseComponent } from 'app/paging/page-base.component';

@Component({
  selector: 'lp-channel-detail',
  templateUrl: './channel-detail.component.html',
  styleUrls: ['./channel-detail.component.scss']
})
export class ChannelDetailComponent extends PageBaseComponent  implements OnInit {

  constructor() {
    super();
  }

  ngOnInit() {
  }

}
