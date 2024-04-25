<input onClick={handleEvent(e, 1)} />
<input onClick={handleEvent(e, 2)} />
<input onClick={handleEvent(e, 33)} />

handleEvent(e, v){
    //do something with e and v
}
if we need handleEvent in multiple place with different value we can we something like function currying.
handleEvent(v){
   return (e)=>{
    //do something with e and v
    }
}
handleEvent(1)
handleEvent(2)
handleEvent(3)

