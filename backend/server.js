const express = require('express');
const cors = require('cors');

const app = express();
app.use(cors());
app.use(express.json()); // allows JSON from frontend

const PORT = 3000;

app.listen(PORT, () => {
    console.log(`Server running on http://localhost:${PORT}`);
});

app.post('/api/groups/create', (req, res) => {
    console.log("ROUTE HIT");

    const group = req.body;

    res.json({
        message: "Study group created!",
        data: group
    });
});