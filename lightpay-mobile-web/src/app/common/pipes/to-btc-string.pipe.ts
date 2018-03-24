import { Pipe, PipeTransform } from '@angular/core';
import { _ } from 'app';

@Pipe({
  name: 'toBtcString'
})
export class ToBtcStringPipe implements PipeTransform {

  transform(value: any, args?: any): any {
    if (_.isNull(value) || _.isUndefined(value) || !_.isNumber(value)) {
      return null;
    } else if (value == 0) {
      return Number(0).toFixed(8);
    }

    return (value / (10**8)).toFixed(8);
  }

}
