# ViewPagerAnimations
# List of Animations
-Depth Transformation <br/>
-Zoom Out Transformation<br/>
-Clock Spin Transformation<br/>
-AntiClock Spin Transformation<br/>
-Fidget Spin Transformation<br/>
-Vertical Flip Transformation<br/>
-Horizontal Flip Transformation<br/>
-Pop Transformation<br/>
-Fade Out Transformation<br/>
-Cube Out Transformation<br/>
-Cube In Transformation<br/>
-Cube Out Scaling Transformation<br/>
-Cube In Scaling Transformation<br/>
-Cube Out Depth Transformation<br/>
-Cube In Depth Transformation<br/>
-Hinge Transformation<br/>
-Gate Transformation<br/>
-Toss Transformation<br/>
-Fan Transformation<br/>
-Spinner Transformation<br/>
-Vertical Shut Transformation<br/>

# Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
#  Step 2. Add the dependency
```
	dependencies {
	        implementation 'com.github.elifozoglu98:ViewPagerAnim:1.0'
	}
  ```
  
  # Step 3. Setup & Usage
  
viewpager.setAdapter(sliderAdapter); // sliderAdepter here is the adapter for your ViewPager <br/>
Anim.FadeOutTransformation fadeOut= new Anim.FadeOutTransformation(); <br/>
viewpager.setPageTransformer(true, fadeOut);<br/>


 

  
  
