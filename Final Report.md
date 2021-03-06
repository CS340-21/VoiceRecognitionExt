# A.V.E.R.I. - Final Report

### Team Name: J.A.R.V.I.S. Aficionados

### Team Name for GitHub: VoiceRecognitionExt

### Team Members:
* [Sehee Hwang](https://github.com/shwang6)
* [Pei Lin](https://github.com/peilin314)
* [Andy Vo](https://github.com/andyv0110)
* [Kedar Vyas](https://github.com/kedarvyas)

## I. Introduction
[Our project A.V.E.R.I.](https://www.canva.com/design/DAEcuVMvMUo/H3cQ7pPjY_3jM2-pKDMxvg/view?utm_content=DAEcuVMvMUo&utm_campaign=designshare&utm_medium=link&utm_source=sharebutton) (Another Voice Expert Recognition Interface) is an Android app that allows users to set reminders based on events, distinguished by a date or location. A.V.E.R.I. allows users to set personalized, situation-based reminder events with voice recognition functionalities. The motivation for our project was J.A.R.V.I.S. from Marvel. J.A.R.V.I.S.’s capabilities of data storage and artificial intelligence hugely inspired us to create an application that can do a fraction of what J.A.R.V.I.S. can do. 

Originally, we intended for A.V.E.R.I. to be a Google Chrome extension, but we changed A.V.E.R.I. to be a mobile application since voice recognition is easier to integrate with mobile apps. Along with this change, we refined our objectives for this project. Our first goal was to create a good UI prototype to determine the general layout and key features for our mobile app. After designing a prototype, we then wanted to develop the actual app. An important change to note is that we decided to switch our focus on the ability for users to set reminders based on a certain date or location, as opposed to situations or keywords. Lastly, we wanted to implement some voice recognition capabilities if we had remaining time.

We are satisfied with our UI prototype, but our app did not reach our desired result since we faced many challenges. Nevertheless, we were able to create a basic functional app. We did manage to integrate voice A.I. by incorporating Alan.

## II. Customer Value
In our project proposal, we defined our primary customer as anyone who does not have prior knowledge on technology or anyone who may need additional accessibility to perform commands. 

As previously mentioned, we originally intended A.V.E.R.I. to be a Google extension, but changed it to be an Android application. Moreover, we changed our focus on the ability to set reminders based on a date or location. Unfortunately, this shift in focus likely resulted in a loss of customer value. Fewer voice functionalities means users spend more time and effort manually setting reminders and lose the ease that comes with setting reminders through a voice assistant. Additionally, as there is already several existing software for setting reminders, our product likly decreased its market value.

The Google Play Store will serve as the media for customers to write their reviews on. In regards to our customer-centric measures of success, we still believe that this will be based on how many users deem our app as an essential to their everyday life.

## III. Technology
<p align="center"><img src="https://i.imgur.com/YAuWC7b.png" width="400" /></p>   

Above is our architecture for the app, we have a reminder class to save the information we needed to pass between the two main classes that represent the app pages within our app. The MainActivity class holds the main page to our app, which includes the reminders list, the calendar, and the add reminders button. The addEvent class holds the page to create a new reminder, with a description of the reminder, some notes for the reminder, and the save button which sends the information back to the mainActivity class.

For this project, we utilized several different tools for the front end and back end. For the front end, we used Figma to create a prototype. For the back-end, since we could not implement Google’s Voice Recognition API for our app as discussed in our proposal, we decided to use Alan for our voice A.I. As planned, the actual development process was fully coded within Android Studio using XML for our app layout and Java for our functionality after we created our prototype.

To create our prototype for the front-end, we utilized Figma as it offered a plethora of tools to seamlessly create a user interface with minimal coding involved. With Figma, we were also able to plan out how we should structure our code based on the features we wanted to implement. While planning out the design of our app, we focused on simplicity and functionality, as we wanted our app to be accessible for all users who wanted to utilize our app for its intended purpose. The simplicity of our app was also a deciding factor for the aesthetics of the interface, as we believed that the app should appeal to all users as well.
 
For our app prototype, we designed a “Login” screen, a “Home” screen, and a “Create New Task” screen. 

<p align="center"><img src="https://i.imgur.com/oGotTnR.png" width="600" /></p>

In this prototype, we focused on what type of information would be presented to the user, as well as the specific layout of certain buttons. With the use of multiple screens and animations, we were able to simulate the actions that a potential user would make.

<p align="center"><img src="https://media.giphy.com/media/oyvXFklsVt7UCbzGtK/giphy.gif" /></p>

As for coding the backend, we intended to implement all of the features that were planned out in the prototype. However, we focused on the main functionalities of our app for the majority of the development cycle, as such we were not able to include the login screen and implementation of the auto-filling of addresses with Google’s map api. During the development cycle, the main functionalities we worked on included implementing an “Add” button that would transition the app to the “Add Event” page, ensuring that when the user saves the event, the reminder would be appended to our list of reminders and saved within the app’s local data for future reference. Thanks to Android Studio’s integrated emulator function, coding the backend was met with a tool that allowed us to visualize and guarantee that our code was functioning correctly. We could easily see our different activity pages and test out the user experience within the emulator. We were also able to effortlessly debug our code with the tools offered in Android Studio, such as Gradle, which compiled our code and built the app within Android Studio. 

<p align="center"><img src="https://i.imgur.com/6Hifp0Y.png" width="200" />
                  <img src="https://i.imgur.com/GpAbswj.png" width="200" /></p>
                  
Alan Studio powers our voice A.I. interface for A.V.E.R.I and seamlessly integrated well with Android Studio. The implementation was clean, but we did need to get more experience with Alan’s interface to maximize results. In order to test Alan’s functions, we simply spoke to Alan through Android Studio’s emulator and received feedback. Even though Alan is highly responsive to voice input, we had difficulty implementing Alan with storing our app’s user input (the additions of events) and Alan’s response to the saved input. As such in order to induce Alan to recognize the user’s input, we had to manually create his response in our demo to exemplify the desired capability for our app.                                
                 
[A sample clip of A.V.E.R.I. can be found here](https://www.youtube.com/watch?v=crhujoHZSGw).


## IV. Team

### Skills: 
All members of the team have proficiency in C++ and are familiar with Python, HTML, CSS, as well as back-end development. None of the members of the team have built something like this before, so this was a new experience for the entire team.

In our project proposal, we designated preliminary roles for each team member:
* Sehee: Back-end
* Pei: Front-end and user interface/user experience
* Andy: Back-end
* Kedar: Front-end and user interface/user experience

Additionally in our project proposal, we specified for roles to be rotating to allow each team member to gain experience in different areas of the project. 

As we progressed through the project, our roles became more static:
* Sehee: User interface/user experience
* Pei: Back-end
* Andy: Back-end
* Kedar: Front-end

Every team member contributed as equally as we could have hoped.

## V. Project Management
| Week          | Goals                                                                                         |
|---------------|-----------------------------------------------------------------------------------------------|
| 02/07 - 02/13 | - Create rough project proposal                                                               |
| 02/14 - 02/20 | - Complete and submit project proposal                                                        |                                
| 02/21 - 02/25 | - Brainstorm basic features needed for A.V.E.R.I. and get familiar with Android Studio        |
| 02/26 - 03/05 | - First Sprint: Start designing app prototype using Figma                                     |
| 03/06 - 03/11 | - Finalize prototype design and begin building<br>- Start on back-end development             |
| 03/12 - 03/25 | - Second Sprint: Start implementing functionalities for reminder actions                      |
| 03/26 - 04/26 | - Finalize front and backend development for actions<br>- Start final report                  |
| 04/27         | - Present project                                                                             |
| 04/29         | - Submit final report                                                                         |

We believe our original expectations for A.V.E.R.I. were quite ambitious, considering that none of our team members had previous experience with Android Studios or building a mobile application in general. Due to the difficulty of learning how to use Android Studios, we were not able to complete all of the goals we originally intended for A.V.E.R.I. A large portion of the problems we faced came with Android Studios. We faced various issues and bugs while working on the front-end and back-end components of the application. Because of the challenges we ran into in the Android development environment, we had to adjust our final goals and objectives. 

## VI. Reflection
During the early stages of our project, our group had set out many development checkpoints and goals to accomplish for our project. Despite not being able to accomplish everything our group initially set out to, we still had many aspects of the project that went well. The application’s user interface and experience definitely surpassed our original expectations, and the final version of our application performed the basic functions we wished for. There were some aspects that did not go as planned, as discussed in the Project Management portion. This was largely due to the problems we encountered while developing on Android Studios. 

In regards to the planning of our project, our team met on Tuesdays and Thursdays on Discord, typically right after class time. During our meetings, we would discuss and plan out our respective objectives for the week, as well as any problems we faced and possible solutions. Our group would agree on each team member’s task for that respective week and set goals for the following week. Development and testing typically went hand-in-hand throughout the creation of our application. Each member had a designated task(s) to complete, whether it was working on front or back-end code, or the UI/UX of the application itself. We would test our code as we went to save time on any future bugs we may encounter. Our team did a fairly good job in regards to team management. As mentioned, each member stayed organized and on top of their goals and objectives each week. 

All in all, we would consider our application A.V.E.R.I. an overall success. Our application performed almost all of the basic functions we had initially set out to do and we were fairly happy with how A.V.E.R.I. turned out. Another reason we would consider the whole project a success is the amount of experience and knowledge we gained throughout the process. As mentioned before, none of the members of our group had previous development experience, so taking on this project was challenging at first. Each member of the team learned and became familiar with Java, developing in Android Studios, designing the user interface of an application, and finalizing and testing the final product. The knowledge gained will be extremely valuable for our future. 
