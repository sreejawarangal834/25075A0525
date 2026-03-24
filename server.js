const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');

const studentRoutes = require('./routes/studentRoutes');

const app = express();

app.use(cors());
app.use(bodyParser.json());

// Test route
app.get('/', (req, res) => {
    res.send("Server is running 🚀");
});

// Routes
app.use('/api', studentRoutes);

// Start server
app.listen(3000, () => {
    console.log("Server running at http://localhost:3000");
});