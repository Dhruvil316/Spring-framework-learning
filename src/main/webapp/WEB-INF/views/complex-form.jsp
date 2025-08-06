<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Complex Form</title>
    <!-- Bootstrap CSS CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card p-4 mx-auto shadow" style="max-width: 500px;">
        <h2 class="text-primary text-center mb-4"><strong>Complex Form</strong></h2>

        <form action="handleform" method="post">
            <!-- Name -->
            <div class="mb-3">
                <label for="name" class="form-label">Your name</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="Enter Name">
                <div class="form-text">We'll never share your name with anyone else.</div>
            </div>

            <!-- ID -->
            <div class="mb-3">
                <label for="id" class="form-label">Your id</label>
                <input type="text" class="form-control" id="id" name="id" placeholder="Enter ID">
            </div>

            <!-- DOB -->
            <div class="mb-3">
                <label for="dob" class="form-label">Your DOB</label>
                <input type="date" class="form-control" id="dob" name="dob">
            </div>

            <!-- Courses -->
            <div class="mb-3">
                <label for="courses" class="form-label">Example Course</label>
                <select multiple class="form-control" id="courses" name="courses" size="4">
                    <option>Java</option>
                    <option>Python</option>
                    <option>C++</option>
                    <option>Django</option>
                    <option>DSA</option>
                    <option>OOPS</option>
                    <option>OS</option>
                </select>
            </div>

            <!-- Gender -->
            <div class="mb-3">
                <label class="form-label">Select Gender</label><br>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="gender" id="male" value="male" checked>
                    <label class="form-check-label" for="male">Male</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="gender" id="female" value="female">
                    <label class="form-check-label" for="female">Female</label>
                </div>
            </div>

            <!-- Student Type -->
            <div class="mb-4">
                <label for="type" class="form-label">Select Type</label>
                <select class="form-select" id="type" name="type">
                    <option selected>Old Student</option>
                    <option>New Student</option>
                </select>
            </div>

            <!-- Submit Button -->
            <button type="submit" class="btn btn-primary w-100">Submit</button>
        </form>


    </div>
</div>

<!-- Bootstrap JS Bundle -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
