const Stream?
Streams in Node.js are a type of data handler that enable reading and writing 
data in chunks instead of loading entire files into memory. 
This allows applications to process data in a more efficient and scalable way
Stream is a sequence of data that is being moved from one point to another over time.
process stream of data in chunks as they arrive insteed of waiting for the entire data
to be available before  processing .
Example: streaming video

*node can not control the pace {goti in bangla} at which data arrives in the stream 
*it can only decide when is the right time to send the data for processing
*if there is data already processed or too little data to process, node puts the arriving 
data in buffer.
*it is an intentionally small area that node maintain in the runtime
to process a stream of data
***highWaterMark is use to limit buffer size; default 64 bytes

Code
const read = fs.createReadStream("./path", {encodig:"utf-8", highWaterMark:2})

read.on("data", (chunks)=>{
    console.log(chunks);
})
read.end("end",()=>{
    console.log('Reading data is complete.');
})

Types of stream-
Readble stream from which data cne be read: E read from a file
Writable streams to which we can wrtie data: E write to a file
Duplex stream taht are both readable and writable: E socket as duplex
Transform stream that can modufy or transform data as it is written and read
E: file compression where you can write compressed data and read ot de-compressed data 
to and from a file as transfrom stream

const Buffer?
A buffer is a temporary memory that a stream takes to hold some data until it is consumed.
Buffers is a  way to handle binary data in memory. 
Buffers are essentially arrays of integers that represent raw binary data.
They can be used to store data in memory, read data from files or network sockets, and manipulate data in various ways.

Pipe
It allows you to easily transfer data from one readable stream to a writable stream.
The concept of a "pipe" refers to a mechanism that allows you to connect the output of
one stream to the input of another stream
const fs = require('fs');

const readableStream = fs.createReadStream('input.txt');
const writableStream = fs.createWriteStream('output.txt');

readableStream.pipe(writableStream);

console.log('Data is being transferred from input.txt to output.txt using a pipe.');

const fs = require('fs');
const { Transform } = require('stream');

const uppercaseTransform = new Transform({
  transform(chunk, encoding, callback) {
    this.push(chunk.toString().toUpperCase());
    callback();
  }
});

fs.createReadStream('input.txt')
  .pipe(uppercaseTransform)
  .pipe(fs.createWriteStream('output.txt'));
  
In this example, data is read from 'input.txt', transformed to uppercase using a transform stream,
 and then written to 'output.txt'. The .pipe calls create a chain of stream operations. Chaining and 
 piping can make your code more readable and maintainable when working with complex data processing pipelines.
