📦 Stock Management Project - SE-FB Group Post
Introduction
I created this project based on a request from an anonymous user in the Software Engineers Club on Facebook. Below, I’m sharing the problems I faced during this project and the resources that helped me solve them.

🛑 Deadlock: Understanding and Resolution
What is Deadlock?
A deadlock occurs when two processes share the same resources and prevent each other from accessing those resources.

🍽️ Simple Example
Imagine Kavi and Vidu went to a restaurant. For some reason, they were given only one plate with one fork and one knife.

Kavi's Plan:

Kavi grabs the fork because he prefers to eat with the fork first. Then, he reaches for the knife to cut his food.
Vidu's Plan:

Vidu grabs the knife because he wants to cut his food first. Then, he reaches for the fork to start eating.
How Does Deadlock Happen?

Kavi picks up the fork.
Vidu picks up the knife.
Kavi tries to grab the knife but can’t because Vidu already has it.
Vidu tries to grab the fork but can’t because Kavi already has it.
How to Resolve This?

One solution could be: “Why don’t one of you use the fork and knife first, and then the other can take their turn?”

Kavi uses both the fork and knife to eat his food.
Vidu waits until Kavi is done, then he uses the fork and knife to eat his meal.
📚 Theoretical Explanation of Deadlock
Mutual Exclusion: The fork and knife are exclusive resources.
Hold and Wait: Kavi holds the fork and waits for the knife, while Vidu holds the knife and waits for the fork.
No Preemption: Neither can force the other to release the resource they are holding.
Circular Wait: Kavi waits for Vidu to release the knife, and Vidu waits for Kavi to release the fork, forming a circular chain.
Next time you encounter an error or get stuck in the process, check these conditions!

📖 Additional Resources
