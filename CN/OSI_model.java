
UDP (User Datagram Protocol) and TCP (Transmission Control Protocol) are both transport layer
protocols in the Internet Protocol (IP).

**TCP (Transmission Control Protocol):**
- **Connection-Oriented:** TCP establishes a connection between two devices (a sender and a receiver) before data transfer begins.
This connection includes a three-way handshake to ensure both sides are ready to communicate.

- **Reliable:** It guarantees that data will be delivered in order and without errors.
If data is lost or corrupted during transmission, TCP automatically retransmits it.

- **Ordered:** Data sent over a TCP connection is received in the same order it was sent. 
TCP ensures that data is properly sequenced.

- **Examples:** TCP is used for applications where data integrity and sequencing are crucial,
such as web browsing, email, file transfers, and most common internet services.

**UDP (User Datagram Protocol):**
- **Connectionless:** UDP does not establish a connection before data transfer.
It simply sends data without a preliminary handshake.

- **Unreliable:** UDP does not guarantee reliable data delivery.
Theres no automatic error detection or correction, and data can be lost or arrive out of order.

- Unordered: Data sent over a UDP connection may not be received in the same order it was sent.

- **Examples:** UDP is used for applications where real-time or low-latency data transmission is more important
than data reliability, such as online gaming, VoIP, streaming media, and DNS (Domain Name System) lookups.








**Layer 1: Physical Layer**
- Transmits raw binary data over a physical medium.
- Encodes data into electrical, optical, or radio signals.
- Manages physical connections, cables, and hardware.
- Data: Bits
- Devices: Hub, network cables (e.g., Ethernet cables), repeaters.

**Layer 2: Data Link Layer**
- Frames data into packets (called frames).
- Assigns MAC addresses for device identification.
- Manages access to the physical medium (e.g., Ethernet collision avoidance).
- Data: Frames
- Protocols: Ethernet, Wi-Fi (802.11)
- Devices: Switch, network bridge, network interface cards (NICs).

**Layer 3: Network Layer**
- Routes data between different networks.
- Uses logical addressing (IP addresses) to identify devices.
- Determines the best path for data transmission.
- Data: Packets
- Protocols: IP (Internet Protocol)
- Devices: Router, Layer 3 switch.

**Layer 4: Transport Layer**
- Ensures end-to-end communication between devices.
- Segments data into smaller units (called segments).
- Provides error detection, flow control, and data sequencing.
- Data: Segments (e.g., TCP segments, UDP datagrams)
- Protocols: TCP (Transmission Control Protocol), UDP (User Datagram Protocol)
- No specific devices at this layer; it's primarily a software function within the operating system.

**Layer 5: Session Layer**
- Manages the establishment, maintenance, and termination of sessions.
- Coordinates dialog between applications on different devices.
- Handles synchronization and error recovery in data exchanges.
- Data: Data streams
- No specific devices at this layer; it's primarily a software function within the operating system.

**Layer 6: Presentation Layer**
- Translates, encrypts, and compresses data as needed.
- Handles data format and character code conversions.
- Ensures data compatibility between heterogeneous systems.
- Data: Data streams
- No specific devices at this layer; it's primarily a software function within the operating system.

**Layer 7: Application Layer**
- Provides user interfaces and network services.
- Hosts applications and network services like web browsers and email clients.
- Initiates and terminates communication between software applications.
- Data: Data streams
- Protocols: HTTP, FTP, SMTP, POP3, IMAP, etc.
- Devices: Computers, servers, application-specific hardware.

This breakdown includes the terminology used at each layer, such as frames, packets, and segments, as well as the specific protocols and devices associated with each layer.