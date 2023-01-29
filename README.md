<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/othneildrew/Best-README-Template">
    <img src="https://user-images.githubusercontent.com/70198061/215286936-a79c0e47-80d2-424b-be71-e9f796ea512d.png" alt="Logo" width="120" height="120">
  </a>

  <h3 align="center">TicTopToe</h3>

  <p align="center">
    <h4 align="center">Simple Tictactoe game with Twenty One Pilots inspired UI</h4>
    <br />
    <a href="https://www.twentyonepilots.com"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://www.youtube.com/watch?v=6yEp6eqi5GQ&list=PLxA687tYuMWiRN3MiC20ReULtgNoBt8EO&ab_channel=TwentyOnePilots-Topic">Listen to Album</a>
    ·
    <a href="https://github.com/Kim-Arcena/TicTopToe/issues">Report Bug</a>
    ·
    <a href="https://github.com/Kim-Arcena/TicTopToe/issues">Request Feature</a>
  </p>
</div>

<div>
  <!-- ABOUT THE PROJECT -->
  <h2>About the Project</h2>

  <p align="center">
    <img src="https://user-images.githubusercontent.com/70198061/215287087-ea553693-4853-477f-a405-a98675da2df6.png" alt="banner" width="100%" />
    <p>Developed this app three months after Twenty One Pilots (my favorite band) released their album "Scaled and Icy. I forgot why I developed this impulsively but the initial design is trashy and I this too. At least it's a little bit better tho. Redesigned this one after at least a year since I also need to append this project to my portfolio. Anyway, I hope you like it! AND STREAMMMM https://open.spotify.com/album/0Q5XBpCYFgUWiG9DUWyAmJ</p>
<div> 
  <!-- FEATURES -->
  <h2>Features</h2>
    <ol>
      <li>Multiplayer Game</li>
      <li>Player input their names.</li>
      <li>Each player take turns on putting the image of Tyler and Josh (X and O alternatives).</li>
      <li>A prompt would display the winner of the game.</li>
      <li>Players can play unlimited rounds.</li>
    </0l>
</div>
  
  
<div>
  <!-- PROJECT SETUP -->
  <h2>Project Setup</h2>
    <ol>
        <li>Download the Zip from the website or clone from Github Desktop. (Turn off VCS integration - Optional)</li>
        <li>Copy the extracted folder into your AndroidStudioProjects folder, which must include the hidden.git folder. (Optional)</li>
        <li>Open Android Studio.<b> Go to File -> New -> Import Project.</b> Then choose the specific project you want to import and then click <b> Next->Finish.</b></li>
        <li>It will build the Gradle automatically and it will be ready to use.</li>
    </ol>
    <h3>Possible errors that you may encounter and how to solve it.</h3>
    <p><b>Error:package android.support.v4.app does not exist. </b><br>To fix it go to <b>Gradle Scripts -> build.gradle(Module:app)</b> and the add the dependecies:</p>  
    <pre>
      dependencies {      
          compile fileTree(dir: 'libs', include: ['*.jar'])  
          compile 'com.android.support:appcompat-{latest version}'  
      }
     </pre>
     <p><b>Error:SDK location not found. Define location with sdk.dir in the local.properties file or with an ANDROID_HOME environment variable.</b>
       <br><b>Delete</b> the following files and go to <b>File -> Invalidate Cache / Restart.</b></p>
     
      .idea/gradle.xml
      .idea/workspace.xml
 
</div>

<div>
  <!-- APP SCREENSHOT -->
  <h2>Gallery</h2>
  <h3>App Screenshots</h3>

  <img src="https://user-images.githubusercontent.com/70198061/215287623-31add652-9cde-41dd-b69d-4a89782df8bb.png" alt="Add Player" width="32%">
  <img src="https://user-images.githubusercontent.com/70198061/215287390-f80e17b5-a4a7-4a24-a607-394f8abc76ae.png" alt="Main Screen" width="32%">
  <img src="https://user-images.githubusercontent.com/70198061/215287383-a4d4b622-2b4b-4873-8e80-b72b886b5de2.png" alt="Result Dialog" width="32%">
  
  
</div>
