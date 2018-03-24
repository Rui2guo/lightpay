import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { WalletComponent } from './wallet/wallet.component';
import { AuthenticationStoreService } from './common/services/store/authentication-store.service';
import { LoginComponent } from 'app/login/login.component';

const routes: Routes = [
  {
    path: '', redirectTo: '/wallet', pathMatch: 'full', canActivate: [AuthenticationStoreService]
  },
  {
    path: 'login', component: LoginComponent
  },
  {
    path: 'wallet', component: WalletComponent, canActivate: [AuthenticationStoreService]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
