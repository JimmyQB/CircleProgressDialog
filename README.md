# CircleProgressDialog

<img src="https://cloud.githubusercontent.com/assets/9053747/7215884/7071f4b8-e61c-11e4-87fb-f46ce56a66e4.png" width="288" height="492" /> 
<img src="https://cloud.githubusercontent.com/assets/9053747/7215886/74c305de-e61c-11e4-90f3-01ffc1ed99ad.png" width="288" height="492" />

<br />
At your TargetActivity.class<br /><br />

private MyCircleProgressDialog myCircleProgressDialog;<br />

onCreate()<br />
  myCircleProgressDialog = new MyCircleProgressDialog(this);<br />
  //Dialog message content "Loading"<br />
  //Dialog duration 5(sec)<br />
  myCircleProgressDialog.showMyCircleProgress("Loading", 5);<br /><br />
  
  //if want to hide dialog earily<br />
  myCircleProgressDialog.hideMyCircleProgress();<br />
  
