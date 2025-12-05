// My personal Library
const myPersonalLibrary = {
  books: [
    {
      title: 'Folks Tale Story',
      description: 'The greatest show man',
      numberOfPages: 607,
      author: 'Francisca',
      reading: true,
    },
    {
      title: 'Sugar Girl',
      description: 'A beautiful drama about a blind widow and her daughter',
      numberOfPages: 8007,
      author: 'Francisca',
      reading: false,
    },
    {
      title: 'The Wonders of Creation',
      description: 'The untold stories about creation',
      numberOfPages: 1000,
      author: 'Francisca',
      reading: true,
    }
  ]
};

for (let book = 0; book < myPersonalLibrary.books.length; book++) {
  if (myPersonalLibrary.books[book].reading === true) {
    console.log(myPersonalLibrary.books[book]);
  }
}
  

