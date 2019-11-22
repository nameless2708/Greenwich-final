import { DatePipe } from '@angular/common'
import { Pipe, PipeTransform } from '@angular/core'
import { TranslateService } from '@ngx-translate/core'

@Pipe({
    name: 'date'
})
export class datePipeProxy implements PipeTransform {
 
    constructor (private translate : TranslateService){}

    public transform(value: any, pattern: string): any {
        let ngPipe = new DatePipe(this.translate.currentLang);
        return ngPipe.transform(value, pattern)
    }
    
}