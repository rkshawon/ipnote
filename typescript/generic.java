interface  Category {
    id:number;
    title:strign;
}

interface  Author {
    name:string;
    id:number
}

interface Post<T>{
    id:number;
    dec:string;
    exe: author[] category[]
}

interface PostBetter<T>{
    id:number;
    dec:string;
    exe:T[]
}

const test:PostBetter<string>{
    id:number;
    dec:string;
    exe:['str', 'dkj'] // type that was passed
}
const test:PostBetter<T extend object>{ // can not use anything else than object 
    id:number;
    dec:string;
    exe:[{id:1,anythin:"cat"}] // type that was passed but object type
}
interface PostBetter<Author>{
    id:number;
    dec:string;
    exe:[{id:1,name:"cat"}] // has to be author property
}
interface PostBetter<Category>{
    id:number;
    dec:string;
    exe:[{id:1,title:"cat"}] // has to be category property
}