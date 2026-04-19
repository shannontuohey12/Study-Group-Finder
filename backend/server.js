const express = require('express');
const cors = require('cors');

const app = express();
app.use(cors());
app.use(express.json()); // allows JSON from frontend

const PORT = 3000;

app.listen(PORT, () => {
    console.log(`Server running on http://localhost:${PORT}`);
});

app.post('/api/groups/create', (req, res) => { //for the createStudyGroup.js file, this is the endpoint we will send the form data to
    const group = req.body;

    console.log("Received from frontend:", group);

    res.json({
        message: "Study group created!",
        data: group
    });
});