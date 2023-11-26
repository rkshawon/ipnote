const state vs variable?
state updates value but variable does not.
state is a crucial concept in React for managing 
dynamic data that triggers re-renders, while variables
are used for storing and managing data that doesnt 
inherently trigger re-renders. Variables can be used 
for intermediate calculations, local data, or data that
doest need to be part of the components state. State,
on the other hand, is essential when you want to manage 
and display data that can change over time and have those 
changes automatically reflected in the UI.

const function call vs components?
components are a more powerful and flexible way to build UI in React,
as they offer features like state management and lifecycle methods. 
Function calls, on the other hand, are simpler and more suitable for small,
static UI elements or when you need to encapsulate and reuse a piece of JSX code

const Package.json?
packagejson is a fundamental configuration file in Node.js 
and is commonly used in Node.js applications and projects, 
including React applications. It contains metadata about 
the project, its dependencies, and various configuration 
settings. Heres an overview of its key purposes and contents:

Metadata: packagejson includes metadata about the project, such as its name, version,
 description, author, license, and more. This information helps developers and tools understand 
 the projects identity and purpose.


Dependencies: One of the most important aspects of packagejson is the listing of project dependencies.
 These dependencies are typically Node.js modules or packages that the project relies on.
  They are specified in the "dependencies" or "devDependencies" sections, 
  depending on whether they are required for production or development purposes.

Scripts: The packagejson file allows you to define scripts that can be executed via npm or Yarn.
 These scripts can automate various tasks, such as running the development server, 
 building the project, testing, and more.

Configurations: You can include project-specific configurations in the packagejson file.
 These configurations can be used to set up various project-related settings or environment variables.