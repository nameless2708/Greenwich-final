import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms'
import { Router } from '@angular/router';
import { TranslateService } from '@ngx-translate/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  searchForm: FormGroup
  languages: any = []
  language: any = {}

  constructor(private fb: FormBuilder,
              private router: Router,
              private translateService: TranslateService) { }

  ngOnInit() {
    this.getLanguages()
    this.initForm()
  }

  getLanguages(){
    this.languages = [
      {description: 'USA', icon: 'flag-usa.svg', value: 'en-US'}
    ]
    this.language = localStorage.getItem('language') ? JSON.parse(localStorage.getItem('language')) : this.languages[0]
    localStorage.setItem('language', JSON.stringify(this.language))
    this.translateService.use(this.language.value)
  }

  setLanguage(lang){
    this.language = lang
    localStorage.setItem('language', JSON.stringify(lang))
    this.translateService.use(lang.value);

  }

  initForm(){
    this.searchForm = this.fb.group({
      searchText: this.fb.control('', [Validators.required])
    })
  }

  search(form){
    console.log('navi');
    if (form.searchText) {
      let text = btoa(form.searchText);
      this.router.navigateByUrl('/', {skipLocationChange: true}).then(()=>
        this.router.navigate(['/search', text]));
    }
  }


}
