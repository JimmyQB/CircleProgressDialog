# CircleProgressDialog

MainActivity.class

private MyCircleProgressDialog myCircleProgressDialog;

onCreate()
  myCircleProgressDialog = new MyCircleProgressDialog(this);
  //Dialog message content "Loading"
  //Dialog duration 5(sec)
  myCircleProgressDialog.showMyCircleProgress("Loading", 5);
  
  //if want to hide dialog earily
  myCircleProgressDialog.hideMyCircleProgress();
  
