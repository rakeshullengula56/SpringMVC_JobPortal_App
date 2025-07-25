<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Job Portal - README</title>
</head>
<body>

  <h1>Job Portal</h1>
  <p>
    <strong>A simple Spring MVC Job Portal</strong> web application built with Java, JSP, and Spring Boot.
  </p>

<h2>Features</h2>
  <ul>
    <li>Add new job postings.</li>
    <li>View all available job postings.</li>
    <li>Clean Spring MVC and JSP structure.</li>
  </ul>

<h2>Project Structure</h2>
  <pre><code>src/
 └── main/
     ├── java/
     │    └── com/
     │         └── jobportal/
     │              └── JobPortal/
     │                   ├── controller/
     │                   │    └── JobController.java
     │                   ├── model/
     │                   │    └── JobPost.java
     │                   └── service/
     │                        └── JobService.java
     └── webapp/
          └── views/
          ├── home.jsp
          ├── addJob.jsp
          ├── success.jsp
          └── viewAllJobs.jsp
</code></pre>

<h2>Controller (<code>JobController.java</code>)</h2>
  <p>
    This controller handles the application's primary web requests, returning logical view names mapped to JSP pages.
  </p>

<h3>Controller Methods</h3>
  <table>
    <thead>
      <tr>
        <th>Mapping</th>
        <th>Method</th>
        <th>View Returned</th>
        <th>Description</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td><code>/</code> or <code>/home</code></td>
        <td><code>@GetMapping</code></td>
        <td><code>home</code></td>
        <td>Returns the homepage (<code>home.jsp</code>).</td>
      </tr>
      <tr>
        <td><code>/addJob</code></td>
        <td><code>@GetMapping</code></td>
        <td><code>addJob</code></td>
        <td>Returns the job add form (<code>addJob.jsp</code>).</td>
      </tr>
      <tr>
        <td><code>/handleForm</code></td>
        <td><code>@PostMapping</code></td>
        <td><code>success</code></td>
        <td>Handles job submission, saves the job, returns success page.</td>
      </tr>
      <tr>
        <td><code>/viewAllJobs</code></td>
        <td><code>@GetMapping</code></td>
        <td><code>viewAllJobs</code></td>
        <td>Shows a list of job posts (<code>viewAllJobs.jsp</code>).</td>
      </tr>
    </tbody>
  </table>

  <p>
    <strong>Note:</strong> When a string is returned in the controller, for example, <code>return "success";</code>, Spring resolves it to <code>success.jsp</code> under <code>/WEB-INF/views/</code> by default.
  </p>

<h2>Technologies Used</h2>
  <ul>
    <li>Java 8+</li>
    <li>Spring Boot / Spring MVC</li>
    <li>JSP (JavaServer Pages)</li>
    <li>Maven or Gradle</li>
    <li>Tomcat or any Servlet Container</li>
  </ul>

<h2>Getting Started</h2>
  <ol>
    <li>
      <strong>Clone the repository:</strong>
      <pre><code>git clone https://github.com/rakeshullengula56/SpringMVC_JobPortal_App.git
cd job-portal
</code></pre>
    </li>
    <li>
      <strong>Configure your database</strong> (if required by your <code>JobService</code> and <code>JobPost</code> model implementation).
    </li>
    <li>
      <strong>Build and run the application:</strong>
      <pre><code>./mvnw spring-boot:run</code></pre>
      <p>or deploy to your application server.</p>
    </li>
    <li>
      <strong>Access the app:</strong>
      <pre><code>http://localhost:8080/</code></pre>
    </li>
  </ol>

<h2>Directory Info</h2>
  <ul>
    <li><strong>controller/JobController.java</strong> - Handles web routes and JSP mapping.</li>
    <li><strong>model/JobPost.java</strong> - JavaBean to represent Job Postings.</li>
    <li><strong>service/JobService.java</strong> - Business logic for adding and retrieving jobs.</li>
  </ul>

<h2>Customization</h2>
  <ul>
    <li>Add more fields to <code>JobPost</code>.</li>
    <li>Implement authentication, search, filters, etc.</li>
    <li>Connect to your preferred database.</li>
  </ul>


  <div class="tip">
    <strong>Tip:</strong> To add new JSP views, simply add new <code>.jsp</code> files to <code>/webapp/views/</code> and map a controller method returning the corresponding view name.
  </div>
</body>
</html>
