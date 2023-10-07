const Memory Leak?
    A Memory leak can be defined as a piece of memory that is no longer being used or required by an application but
    for some reason is not returned back to the OS.In simple terms it is forgotten data forever waiting to be used.
    link: 'https://medium.com/preezma/memory-leaks-in-javascript-and-how-to-avoid-them-63916a02f68#:~:text=A%20Memory%20leak%20can%20be,forever%20waiting%20to%20be%20used.'

const Garbage collection?
    *Garbage collection in JavaScript is a process that automatically manages memory by reclaiming unused memory
    occupied by objects that are no longer needed in a JavaScript program. JavaScript engines,
    like the one in browsers or Node.js,handle this process to ensure efficient memory usage and prevent memory leaks.
    
    The garbage collection process involves two primary techniques: reference counting and the Mark and Sweep algorithm.
    Reference counting keeps track of how many references an object has; when an objects reference count drops to zero,
    it becomes eligible for removal. The Mark and Sweep algorithm, on the other hand, identifies and collects object
    that are no longer accessible from the root of the application.