# CircleProgressDialog

At your TargetActivity.class<br /><br />

private MyCircleProgressDialog myCircleProgressDialog;<br /><br />

onCreate()<br />
  myCircleProgressDialog = new MyCircleProgressDialog(this);<br />
  //Dialog message content "Loading"<br />
  //Dialog duration 5(sec)<br />
  myCircleProgressDialog.showMyCircleProgress("Loading", 5);<br /><br />
  
  //if want to hide dialog earily<br />
  myCircleProgressDialog.hideMyCircleProgress();<br />
  
