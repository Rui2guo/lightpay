export module AuthenticationAction {

  export interface IssuedToken {
    accessToken: string;
    accessTokenExpirationTime: number;
    refreshToken: string;
    refreshTokenExpirationTime: number;
  }

}
