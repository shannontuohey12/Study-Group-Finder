async function createStudyGroup(e) {
    e.preventDefault();

    const data = {
        studyGroupTitle: document.getElementById("studyGroupTitle").value,
        date: document.getElementById("date").value,
        time: document.getElementById("time").value,
        subject: document.getElementById("subject").value
    };

    const response = await fetch('http://localhost:3000/api/groups/create', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data)
    });

    const result = await response.json();
    console.log(result);
}