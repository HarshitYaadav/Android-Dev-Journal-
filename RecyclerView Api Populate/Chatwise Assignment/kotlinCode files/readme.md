Screen 1 : MainActivity.kt , contains intent on click listener, to Screen 2 which is ProductList activity

Jsondata.kt file : contains data class of product , which contains products list containing information required , so a new data class Product.kt containing list of products attribute is created.  

ApiService.kt file contains the get function to retreive data from the api , end node beign " products ".

rvAdaptor.kt is the recyclerview adaptor which sets the data populates the cardview design  and data to our recyclerview and contains various method for it. also it extracts information from different attribute of attribut and attaches it to the card , it uses glide to extract image from the url.

ProductList.kt is the activity kt file containing layoutmananger which collects information from our api using retrofit and loads the recyclerview.
