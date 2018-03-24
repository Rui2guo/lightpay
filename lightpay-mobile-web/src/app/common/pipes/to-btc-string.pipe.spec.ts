import { ToBtcStringPipe } from './to-btc-string.pipe';

describe('ToBtcStringPipe', () => {
  it('create an instance', () => {
    const pipe = new ToBtcStringPipe();
    expect(pipe).toBeTruthy();
  });
});
