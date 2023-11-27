const Hooks?
    React hooks are functions that enable functional components to manage
    state and side effects, allowing developers to use stateful logic and 
    lifecycle features in functional components

const useEffect and useState?
useState:
    useState is a React hook that enables functional components to manage state. 
    It returns an array with two elements: the current state value and a function to update that value. 
    This allows functional components to have and update local state, making them more dynamic and interactive.

useEffect:
    useEffect is a React hook used for handling side effects in functional components. 
    It allows you to perform tasks such as data fetching, subscriptions, or manual DOM manipulations.
    useEffect takes a function as its argument, which will be executed after the component renders. 
    It can also return a cleanup function to handle any necessary clean-up when the component is unmounted or 
    when the dependencies change, helping to manage the components lifecycle.


const state and props?
State:
    In React, state is a JavaScript object that represents the internal data of a component. 
    It allows components to manage and maintain their own data, and when the state changes,
    the component re-renders to reflect the updated information. State is mutable and can be
    modified using the setState function, triggering a re-render of the component.

Props:
    Short for properties, props are a mechanism in React for passing data from a parent component to its child components.
    Props are immutable and provide a way for parent components to communicate with and configure their children. 
    Child components receive props as arguments and use the data to render dynamically. Props help create a hierarchy 
    of components that can share and pass data throughout a React application.
