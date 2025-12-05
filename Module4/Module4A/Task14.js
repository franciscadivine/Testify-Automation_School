//Object Literal
const books ={
  title:'Folks Tale Story',
  description:'The greatest show man',
  numberOfPages: 607,
  authour: 'Francisca',
  reading: true,
toggleReadingStatus: function(){
    if(this.reading === true){
      this.reading = false
    }
    else this.reading = true
  }

}
myPersonalLibrary.toggleReadingStatus()
console.log(books)
console.log(books.authour)