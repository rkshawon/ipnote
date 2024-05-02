<input onClick={handleEvent(e, 1)} />
<input onClick={handleEvent(e, 2)} />
<input onClick={handleEvent(e, 33)} />
<input onClick={handleEvent(e, 50)} />

handleEvent(e, v){
  console.log(e,v)
}

if we need handleEvent in multiple place with different value we can we something like function currying.
handleEvent(v){
   return (e)=>{
    console.log(e,v)
    }
}
handleEvent(1)
handleEvent(2)
handleEvent(3)
handleEvent(5)

