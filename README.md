# Web-Sockets
Simple 💬 Real-time Chat

A simple real-time chat application built with WebSockets using Node.js and the `ws` library.

## Features

- 💬 Real-time message broadcasting
- 👥 Multiple users can chat simultaneously
- 🔔 Join/leave notifications
- ⚡ Instant message delivery
- 📱 Responsive design
- 🎨 Modern UI with gradient styling

## Installation

1. Clone the repository
2. Install dependencies:
```bash
npm install
```

## Usage

1. Start the server:
```bash
npm start
```

2. Open your browser and navigate to:
```
http://localhost:8080
```

3. Open multiple browser tabs/windows to test the real-time chat functionality

4. Type your name (optional) and start chatting!

## Technical Details

- **Server**: Node.js with `ws` WebSocket library
- **Client**: Vanilla JavaScript with WebSocket API
- **Port**: 8080 (configurable via PORT environment variable)

## How it Works

1. The server creates both an HTTP server (to serve the HTML) and a WebSocket server
2. When clients connect, they're added to the active clients set
3. Messages from any client are broadcast to all other connected clients
4. System messages notify when users join or leave
5. The client automatically reconnects if the connection is lost

