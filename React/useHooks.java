//useState
useState is asynchonous in nature. 
When you call the setState function returned by useState,
React schedules an update but doesnt immediately apply it. 
Instead, it batches state updates for performance reasons.

// useEffect
This hooks let us perfom side effect in functional components.
its is a close replacement for compoentDidMound, DidUpdate, 
WillUnmount.

//useCotext
Context provide a way to pass data through the component tree 
without having to pass props down manually at every level
Example 
const Usercontext = React.createContext() / createContext() 
<Usercontext.provider value={any vlaue}>
    <App/>
</Usercontext.provider>

useContext hook-
const user = useContext(Usercontext) 
use has the value  which is provided as value with provider

//useReducer
useReducer is use to manage state, an alternative of useState
its more primitives, useState use useReducer internally

const initialState = anything like string number object or array
if type and value are passed then
its action.type 
and state.value
const reducer = (state, action)=>{
    switch(action){
        case "+1":
            return state+1;
        case "-1":
            return state-1;
        case "0":
            return 0;
        default:
            state;
    }
}
const [count, dispatch] = useReducer(reducer, initialState)

to display use count 
to perform action use dispatch("0")
also possible dispatch({type:'', value:0})

//useCallback
useCallback is a hook that will return a memoized version of the callback function that only 
changes if one of the dependencies has changed
it is usefull when passing callbacks to optimized child components that rely on
reference equality to prevent unnecessary renders
const demo = useCallback(()=>{
    functionality....
},[dependencies])

useCallback is used to memoize a callback function. 
It is particularly useful when passing callbacks to child 
components to prevent unnecessary re-renders of those components.

//useMemo
useMemo inokes provided function and caches its result
when need to caches the result of an invoked function use memo

//customhook
its a js funcion whose name start with use
it can call other hook if required
why?
to share logic between two or more components