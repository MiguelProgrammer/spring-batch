# spring-batch

<div align="center">
  <img src="https://i.imgur.com/q0dEurk.png" width="110">
  <img src="https://i.imgur.com/S4Nyu9q.png" width="180"> 
  <h3 align="center">👨‍🏫 Spring-batch Project </h2>

  <p align="center">Spring-batch was created  by Accenture corporation, spring-batch is evolution of services old jobs on cobol.</p>
</div>

<em> * [Spring Batch — Overview](https://giuliana-bezerra.medium.com/spring-batch-para-desenvolvimento-de-jobs-1674ec5b9a20) </em>

## Architeture Spring Batch 
<div align="center"><img src="https://i.imgur.com/w1bQ56i.png" width="700"></div>

## Components
<div align="center"><img src="https://i.imgur.com/Gtqnk6Q.png" width="700"></div>

### <b>Job Repository</b>: It is shared and stores the job status and other execution duration infomrations, execution status, errors, writes, reads.

### <b>Step</b>: Task, step, or step running and are chained together to perform the desired processing. If chunk-based it handles <b>itemreader reading</b>,<b>ItemProcessor processing</b>, and<b>ItemWriter writing</b> If it is a simple task, the step can be based on <b>Tasklets</b>

### <b>Job Launcher</b>: Performs the job in fact, considering factors such as how (single thread, distributed), parameter validation, restart, and other execution properties.

## Documentation
<div align="center"><img src="https://i.imgur.com/4v64QFT.png" width="900"></div>

    

