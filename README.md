

stockManagement-SE-FB-GRP-POST
 I Create this projuct the request some anoynmous user post in software engineers club in facebook.
i ll post the post screenshot.

Hope someone reading this.i ll post the problems i faced in this project.And Resources to solve.

![Uploading ClipWindowsGIF.gif…]()


 
 ....................................................DEADLOCK ................................................

FOR CLEAR ARTICLE READ MEDIUM I WROTE-->👍https://medium.com/@4kavindu2002/what-id-deadlock-1b0348f22be6



WHAT ID DEADLOCK?
HEY I AM KARUNATHILAKA...! POST THINGS I LEARNED.

WHAT IS DEADLOCK a:
This happen when two process sharing the same resources and effectively prevent each other from accessing the resources.

SIMPLE EXAMPLE:
Imagine Kavi and Vidu went to eat at restaurant:
for some reason they gave them only one plate with one fork and knife (or something you called :-).

Kavi's Plan:
#Kavi grabs the fork because he likes to eat with the fork first. Then, he reaches for the knife to cut his food.

Vidu's Plan:
Vidu grabs the knife because he wants to cut his food first. Then, he reaches for the fork to start eating.

Let's see now HOW dead lock comes in:
1: Kavi picks up the fork.
2: Vidu picks up the knife.
3: Kavi tries to grab the knife but can't because Vidu already has it.
4: Vidu tries to grab the fork but can't because Kavi already has it.

According to this Example How to Resolve this →


Thenn they can do: "Why don't one of you use the fork and knife first, and then the other can take their turn?"


Kavi uses both the fork and knife to eat his food.

Vidu waits until Kavi is done, then he uses the fork and knife to eat his meal.

Here is the Theoritical part(Kind of);

Mutual Exclusion: The fork and knife are exclusive resources.

Hold and Wait: Kavi holds the fork and waits for the knife, while Vidu holds the knife and waits for the fork.

No Preemption: Neither can force the other to release the resource they are holding.

Circular Wait: Kavi waits for Vidu to release the knife, and Vidu waits for Kavi to release the fork, forming a circular chain.

Sooo,next time you got a as# error/stuck in the process check these out!

link:What is deadlock | Necessary Conditions | OS | Lec-63 | Bhanu Priya (youtube.com)






















