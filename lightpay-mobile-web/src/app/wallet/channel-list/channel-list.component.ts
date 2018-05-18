import { Component, OnInit } from '@angular/core';
import { PageBaseComponent } from 'app/paging/page-base.component';

@Component({
  selector: 'lp-channel-list',
  templateUrl: './channel-list.component.html',
  styleUrls: ['./channel-list.component.scss']
})
export class ChannelListComponent extends PageBaseComponent implements OnInit {

  constructor() {
    super();
  }

  ngOnInit() {
  }

}
