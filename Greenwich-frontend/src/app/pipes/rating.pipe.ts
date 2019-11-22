import { Pipe, PipeTransform } from '@angular/core'

@Pipe({
    name: 'rate'
})
export class ratingPipe implements PipeTransform {
    public transform(value: number): Array<number> {
        let res = [];
        for(let i=0; i<value; i++){
          res.push(1);
        }
        return res;
    }
}
