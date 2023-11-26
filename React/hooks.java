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
