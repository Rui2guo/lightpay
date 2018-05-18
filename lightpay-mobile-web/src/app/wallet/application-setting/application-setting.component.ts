import { Component, OnInit } from '@angular/core';
import { PageBaseComponent } from 'app/paging/page-base.component';

@Component({
  selector: 'lp-application-setting',
  templateUrl: './application-setting.component.html',
  styleUrls: ['./application-setting.component.scss']
})
export class ApplicationSettingComponent extends PageBaseComponent implements OnInit {

  constructor() {
    super();
  }

  ngOnInit() {
  }

}
