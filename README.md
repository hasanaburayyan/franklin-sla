# Franklin University Structured Learning Assistance

Welcome to my Structured Learning Assistance (SLA) HUB! Hopefully this repo will serve as a great resource to you on your journey for continued education.

<a href="https://hasanaburayyan.github.io/franklin-sla/">**Checkout The Website!**</a>

## Purpose Of This Repo

To provide a central hub for my SLA courses and materials!

## Available SLA Courses

[COMP 511](comp511/welcome.md)

## My Tips

1. Don't Procrastinate
    1. Programming can be very challenging at times, and might require stepping away, going for a walk, distracting yourself, etc. You want to make sure you have plenty of time to do stress relief.
2. The Rubber Duck is REAL
    1. Sometimes just trying to explain the problem to others, gives you a perspective on the problem you had not thought of yet.
3. When in doubt Debug, Debug, Debug
    1. learning to use a debugger and step through code is invaluable. It can be nearly impossible to keep track of every variable in your head, so do not hesitate to just step through your code line by line.
4. Read through the code at a high level
    1. Start by maybe just reading the Class names, then read the class names and their function names. You may find it overwhelming to start digging into the logic of every function as you first read through an assingment
5. There are many ways to solve every problem. Try not to focus on what the BEST solution is, iterate and make it better.
    1. How can I print out "Bash-is'nt-scary-it-makes-me-stronger" in a BASH shell? Below we can see two solutions to the same problem. Solution one is LARGE and scary with MANY MANY additional steps that are not needed. Solution two is a quick
       and concise way to accomplish the task. The point here is we may not always see the forest through the trees, sometimes the simple solution may not seem obvious. Focus on getting your code to work, then come back and make it better!
        1. 
        ```bash
          echo "BASH-is-scary-it-makes-me-nervous" \
           | sed "s/-.s-/-is'nt-/" \
           | awk -F"-" '{\$NF=""; print \$0}' \
           | awk '{print \$0 "str"}' \
           | perl -pe 's/(st.)/\$1ong/' > f \
           && M=\$(cat f) && echo "\${M}er"
        ```
        2. 
        ```bash
        echo "BASH-is'nt-scary-it-makes-me-stronger"
        ```

### About Me

My name is Hasan, I am overtly passionate about computer science, so please excuse the excitement and occasional ramblings. By day I work on an AWS application migration efforts at Chemical Abstract Services, by night I help students at Franklin University with an array of computer science courses! In my free time I enjoy to miserably fail at trying to convince my wife and 3 children they love computer science as much as I do. Some other hobbies include; archery, yoyos, and watching movies that are soo terrible they are wonderful!

Favorite Quote:

> "Computer science is no more about computers than astronomy is about telescopes" - Edsger Dijkstra

Email: hasanaburayyan21@gmail.com

Links: [:fontawesome-brands-linkedin:{ .linkedin }](https://www.linkedin.com/in/hasan-abu-rayyan-630563a2/)
 | [:fontawesome-brands-github-square:{ .github }](https://github.com/hasanaburayyan)
 | [:fontawesome-brands-gitlab:{ .gitlab }](https://gitlab.com/hasanaburayyan)