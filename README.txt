You can find the View class called ImageView under src\main\java\com\timprojet\affichagedinformationssuruneimage
If you want to change the image used in the app, you should change this line:
public Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cheopspyramid);
instead of cheopspyramid, write the name of any of the other 2 images.
We could implement a way to change the current image, but that's for later.