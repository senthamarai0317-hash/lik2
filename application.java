package com.example.technova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    private static final String HTML = """
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>TechNova Solutions</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial,Helvetica,sans-serif;
}

body{
    background:linear-gradient(135deg,#0f172a,#1e3a8a,#3b82f6);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    color:white;
}

.container{
    width:90%;
    max-width:1100px;
}

.card{
    background:rgba(255,255,255,0.12);
    backdrop-filter:blur(15px);
    border-radius:20px;
    padding:40px;
    box-shadow:0 20px 40px rgba(0,0,0,.3);
    text-align:center;
}

h1{
    font-size:42px;
    margin-bottom:15px;
}

p{
    font-size:18px;
    color:#f1f5f9;
    margin-bottom:30px;
}

button{
    padding:15px 35px;
    border:none;
    border-radius:10px;
    background:#22c55e;
    color:white;
    font-size:18px;
    cursor:pointer;
    transition:.3s;
}

button:hover{
    background:#16a34a;
    transform:scale(1.05);
}

.grid{
    margin-top:40px;
    display:grid;
    grid-template-columns:repeat(auto-fit,minmax(220px,1fr));
    gap:20px;
}

.box{
    background:white;
    color:#111827;
    padding:25px;
    border-radius:15px;
    transition:.3s;
}

.box:hover{
    transform:translateY(-8px);
}

.box h2{
    font-size:40px;
    color:#2563eb;
}

.box p{
    color:#555;
    margin-top:10px;
}

footer{
    margin-top:30px;
    color:white;
    font-size:15px;
}

#status{
    margin-top:20px;
    font-size:22px;
    color:#22c55e;
    font-weight:bold;
}
</style>

</head>
<body>

<div class="container">

<div class="card">

<h1>🚀 TechNova Solutions</h1>

<p>Professional Spring Boot Application Running Successfully</p>

<button onclick="checkStatus()">Check Application</button>

<div id="status"></div>

<div class="grid">

<div class="box">
<h2>150+</h2>
<p>Projects Completed</p>
</div>

<div class="box">
<h2>50+</h2>
<p>Happy Clients</p>
</div>

<div class="box">
<h2>99%</h2>
<p>Success Rate</p>
</div>

<div class="box">
<h2>24/7</h2>
<p>Support Available</p>
</div>

</div>

<footer>

Spring Boot | HTML | CSS | JavaScript | AWS EC2

</footer>

</div>

</div>

<script>

function checkStatus(){
    document.getElementById("status").innerHTML =
    "✅ Spring Boot Application is Running Successfully!";
}

</script>

</body>
</html>
""";

    @GetMapping("/")
    public String home() {
        return HTML;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
