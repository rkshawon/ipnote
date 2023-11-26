let a = 4 // default number
let a = "je;;;p" // default string

let a:string
let a:number = 4


let a:(string|number) = 3;
let a:string|number = 3;
let a :(string | number) ; // numer or string

let a :(string | number)[]; // number or string array
let a : string | number []; // not possible
let a = [4,5,"hel"]; // not possible

const obj={
    age:45,
    name:"hola"
}
obj.age = 45;
obj.age = "45";// not work by by default the assing type is set as type
obj.address = 45; // not gonna work not defined

let User = {
    age:number,
    name:string, // can be make name optional with ? name?:string
    isAdmin:boolean
}

obj = {
    age:7,
    isAdmin:true
}
// throw error as we did not use name. have to use name, can make optional with ?

//cant add new like phone. have to be same

//default to return type 
const add = ()=>{
    return 2
}//both same
const add = ():number=>{
    return 2
}

const add = (num:number)=>{
    return number
}//both same
const add = (num:number, num2:number):number=>{
    return number
}
//no return then its void type
add(12,2)//must take two params 
const add = (num:number, num2:number, optional?:number):number=>{
    return number
}
add(12,2)//now its optional

//type can store value and object 
type a = "j" | 'k'

type UserType = {
    age:number;
    name:string; 
    isAdmin:boolean;
    theme: "dark | light"; // only two can be used
}// can be use anywhere as alias
const add = (user:UserType):number=>{
    return user.age
}

interface  UserType {
    age:number;
    name:string; 
    isAdmin:boolean;
    theme: "dark | light";
}
//everything is same with extra type like this employee_type:string
type Employee extend UserType {
    employee_type:string;
}