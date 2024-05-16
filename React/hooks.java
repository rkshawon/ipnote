const Hooks?
Hooks were added in react version 16.8
React hooks were introduced to provide a way to use state and other React features in functional components
Before hooks, state and lifecycle methods were only available in classs component. 

Hooks allow functional components to manage state and side effects.

Reusability: Hooks encourage the creation of reusable logic.
 You can extract stateful logic from a component and place it in a custom hook, 
 making it easy to share and reuse that logic across different components.

No need for HOCs or render props: Prior to hooks, higher-order components (HOCs) and render props were 
common patterns for code reuse and state management. Hooks provide a more direct and simpler way to achieve 
the same goals, reducing the need for these patterns in many cases.

Easier to Understand Lifecycle: With hooks, the lifecycle of functional components is easier to understand.
 Each hook has a specific purpose and is typically named according to the lifecycle method it replaces
  (e.g., useEffect replaces componentDidMount, componentDidUpdate, and componentWillUnmount).

React can optimize the performance of functional components with hooks more effectively.
This is because functional components can avoid unnecessary re-renders through the use of the memo and useMemo hooks.

hook does not work inside class
hooks avoid the whole confusion with this keywords
avoid binding in event handler 
class makes hot reloading unrealiable

call hooks only in top level
dont call hooks inside loops conditions an nested functions
call in only react functional components not in normal function


Rule #1: Only call hooks from React function components. Hooks are not supported in class 
components or in regular JavaScript functions. This ensures that hook behavior is predictable 
and consistent. By following this rule, we can easily separate our hook-based logic from the 
rest of our application`s logic.

Rule #2: Only call hooks at the top level of your function components. Do not call them 
within other functions, conditionals, or loop blocks. This one has to do with making sure 
that our hooks are called every time, and in the same order, each time a component re-renders.

As users interact with the application, triggering re-renders, React runs its functions, 
including all hook calls. So, how can React keep track of the useState() or useEffect() 
calls that are made between renders?

React tracks the hooks` data and callbacks by their sequence in the component. If we run 
our hooks only during some re-renders and not others, this order will get jumbled, causing 
unexpected results.