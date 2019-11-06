# AkashCustomJava

allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}


implementation 'com.github.akash84016:CustomBottomBarJava:1.2'



For Using Camera need permission in mainifest or runtime permission

//camera capture image gettting for use thi code
 @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == AkashCustom.CAMERA_ACTION_PICK_REQUEST_CODE && resultCode == RESULT_OK) {
            Uri uri = Uri.parse(AkashCustom.currentPhotoPath);
            Glide.with(this).load(uri).into(imageView); // good for image display use Glide Library
            AkashCustom.currentPhotoPath = "";
        }
    }


 
