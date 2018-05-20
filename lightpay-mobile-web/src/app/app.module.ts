import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppRoutingModule } from './app-routing.module';

import { ServiceWorkerModule } from '@angular/service-worker';

import { environment } from '../environments/environment';
import { RootComponent } from './root/root.component';
import { MainComponent } from './main/main.component';
import { WalletComponent } from './wallet/wallet.component';
import { PaymentComponent } from './wallet/payment/payment.component';
import { AccountComponent } from './wallet/account/account.component';
import { PagingComponent } from './paging/paging.component';
import { ReceivingComponent } from './wallet/receiving/receiving.component';
import { LoadingMaskComponent } from 'app/loading-mask/loading-mask.component';
import { ReadInvoiceComponent } from './wallet/payment/read-invoice/read-invoice.component';
import { ConfirmInvoiceComponent } from './wallet/payment/confirm-invoice/confirm-invoice.component';
import { CompletePaymentComponent } from './wallet/payment/complete-payment/complete-payment.component';
import { InvoiceFormComponent } from './wallet/receiving/invoice-form/invoice-form.component';
import { OutputInvoiceComponent } from './wallet/receiving/output-invoice/output-invoice.component';
import { QrCodeComponent } from './qr-code/qr-code.component';
import { EmptyPipe } from './common/pipes/empty.pipe';
import { MomentPipe } from './common/pipes/moment.pipe';
import { ToBtcStringPipe } from './common/pipes/to-btc-string.pipe';
import { ApiService } from 'app/common/services/api.service';
import { WebsocketService } from 'app/common/services/websocket.service';
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { PagingActionService } from 'app/paging/paging-action.service';
import { WalletActionService } from 'app/common/services/action/wallet-action.service';
import { WalletStoreService } from 'app/common/services/store/wallet-store.service';
import { PaymentActionService } from 'app/common/services/action/payment-action.service';
import { NetworkActionService } from 'app/common/services/action/network-action.service';
import { LoginComponent } from './login/login.component';
import { AuthenticationActionService } from './common/services/action/authentication-action.service';
import { AuthenticationStoreService } from './common/services/store/authentication-store.service';
import { AutoRefreshTokenService } from 'app/common/services/auto-refresh-token.service';
import { ReceiveCoinsComponent } from './wallet/receive-coins/receive-coins.component';
import { SendCoinsComponent } from './wallet/send-coins/send-coins.component';
import { WalletHistoryComponent } from './wallet/wallet-history/wallet-history.component';
import { WalletHistoryDetailComponent } from './wallet/wallet-history/wallet-history-detail/wallet-history-detail.component';
import { WalletMenuComponent } from './wallet/wallet-menu/wallet-menu.component';
import { ApplicationSettingComponent } from './wallet/application-setting/application-setting.component';
import { ChannelListComponent } from './wallet/channel-list/channel-list.component';
import { ChannelDetailComponent } from './wallet/channel-list/channel-detail/channel-detail.component';
import { OpenChannelComponent } from './wallet/channel-list/open-channel/open-channel.component';

@NgModule({
  schemas: [
    
  ],
  declarations: [
    LoadingMaskComponent,
    RootComponent,
    MainComponent,
    WalletComponent,
    PaymentComponent,
    AccountComponent,
    PagingComponent,
    ReceivingComponent,
    ReadInvoiceComponent,
    ConfirmInvoiceComponent,
    CompletePaymentComponent,
    InvoiceFormComponent,
    OutputInvoiceComponent,
    QrCodeComponent,
    ToBtcStringPipe,
    EmptyPipe,
    MomentPipe,
    LoginComponent,
    ReceiveCoinsComponent,
    SendCoinsComponent,
    WalletHistoryComponent,
    WalletHistoryDetailComponent,
    WalletMenuComponent,
    ApplicationSettingComponent,
    ChannelListComponent,
    ChannelDetailComponent,
    OpenChannelComponent
  ],
  entryComponents: [
    LoadingMaskComponent,
    ReadInvoiceComponent,
    ConfirmInvoiceComponent,
    CompletePaymentComponent,
    InvoiceFormComponent,
    OutputInvoiceComponent,
    QrCodeComponent,
    ReceiveCoinsComponent,
    SendCoinsComponent,
    WalletHistoryComponent,
    WalletHistoryDetailComponent,
    WalletMenuComponent,
    ApplicationSettingComponent,
    ChannelListComponent,
    ChannelDetailComponent,
    OpenChannelComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpModule,
    AppRoutingModule,
    ServiceWorkerModule.register('/ngsw-worker.js', { enabled: environment.enableServiceWorker })
  ],
  providers: [
    ApiService,
    WebsocketService,
    DispatcherService,
    PagingActionService,
    WalletActionService,
    WalletStoreService,
    PaymentActionService,
    NetworkActionService,
    AuthenticationActionService,
    AuthenticationStoreService,
    AutoRefreshTokenService
  ],
  bootstrap: [RootComponent]
})
export class AppModule { }
