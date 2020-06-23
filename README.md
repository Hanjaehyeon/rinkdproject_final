# rinkdproject_final

# rink:D

# [목차]   
## 1.소개     
1-1. 어플 소개    
1-2. 어플의 기능    
1-3. 주제 선정 이유    
1-4. 개발 툴 & 개발 언어

   
## 2.주차별 계획표
   

## 3.기능 구현    
3-1. 홈 카테고리   
       - Google API   
3-2. 프랜차이즈 카테고리    
3-3. 음료 카테고리    
       - FireBase    
3-4. 검색 카테고리


## 4.구현 사진


## 5.마무리     
5-1. 맡은 부분    
5-2. 개선 방안     

***


### 어플 소개

* 프랜차이즈 카페의 종류, 메뉴를 한눈에 볼 수 있는 어플


***


### 어플의 기능   
1. 메뉴 결정이 어려운 소비자를 위한 음료 추천   


2. 내 주변에 있는 카페의 위치를 알 수 있음  


3. 프랜차이즈 카페마다 어떤 메뉴가 있는지 보기 쉽게 정리    


4. 카테고리별로 음료를 분류해 보기 쉽게 정리       


5. 어떤 음료와 프랜차이즈가 있는지 검색


***

### 주제 선정 이유


> 점점 늘어가는 프랜차이즈 카페, 그만큼 카페의 종류도 음료의 종류도 매우 많아져   
    소비자 스스로 메뉴를 일일히 검색해봐야하는 불편함    

> 프랜차이즈 카페마다 어떤 음료가 있는지 궁금하지만 한눈에 보기 어려움    

> 어떤 음료를 마실지 고민되지만 음료에 대해 잘 모르는 소비자를 위한 어플


***

### 개발 툴

* 안드로이드 스튜디오
![android_studio_logo](https://user-images.githubusercontent.com/62926717/85362786-5078ce80-b55a-11ea-85de-b7971ccfe7f2.png)


* 파이어베이스   
![firebase_logo](https://user-images.githubusercontent.com/62926717/85362928-ad748480-b55a-11ea-96a2-cbc86549d3fb.jpg)


### 개발 언어

* JAVA   
![java_logo](https://user-images.githubusercontent.com/62926717/85363139-1a881a00-b55b-11ea-9d70-aeae08cfe0d0.png)


***

## 주차 별 프로젝트 계획표

<img width="800" alt="grayshakeitya" src="https://user-images.githubusercontent.com/62926717/85366240-e6fcbe00-b561-11ea-90e5-f1587d0347d3.PNG">


***


## 코드



#### Google API키 발급받기

<https://console.developers.google.com/apis/dashboard?project=rinkd-281206&folder=&organizationId=>

프로젝트 이름을 정하고 생성한 뒤, 위의 링크로 접속하여 구글API키를 발급 받아야한다.


1. 프로젝트 만들기를 클릭한다.     
<img width="746" alt="googleApi1-1" src="https://user-images.githubusercontent.com/62926717/85369303-d7807380-b567-11ea-8697-bea73517731c.png">    


2. 원하는 프로젝트 이름을 작성한 뒤, '만들기'를 클릭한다.      
<img width="654" alt="googleApi2" src="https://user-images.githubusercontent.com/62926717/85369449-17dff180-b568-11ea-8f35-ad9b2d2fc2af.PNG">     


3. 생성된 프로젝트에서 'API 및 서비스 사용 설정'을 클릭한다.     
<img width="634" alt="googleApi3-1" src="https://user-images.githubusercontent.com/62926717/85369614-5d042380-b568-11ea-8956-c816042a6ee8.png">     


4. 검색창에 'google maps android'를 검색하고 Maps SDK for Android를 클릭한다.     
<img width="723" alt="googleApi5" src="https://user-images.githubusercontent.com/62926717/85369778-b1a79e80-b568-11ea-95d0-64c75aefa19e.PNG">     



5. '사용'을 클릭해 활성화한다.     
<img width="481" alt="googleApi6" src="https://user-images.githubusercontent.com/62926717/85369913-e9aee180-b568-11ea-8503-af16d7e35101.PNG">      


6. 인증 설정을 위해 '사용자 인증 정보 만들기'를 클릭한다.     
<img width="656" alt="googleApi8-1" src="https://user-images.githubusercontent.com/62926717/85370431-ad2fb580-b569-11ea-92ce-eb90c222c825.png">


7. 앞에서 생성된 API 키에 사용 제한을 둘 수 있는 웹페이지에서 '키 제한'을 클릭한다.
<img width="394" alt="googleApi9-1" src="https://user-images.githubusercontent.com/62926717/85370603-e8ca7f80-b569-11ea-94e8-8bc40c55cd84.png">


8. 애플리케이션 제한사항에서 'Android앱'을 선택한다.    
<img width="274" alt="googleApi10" src="https://user-images.githubusercontent.com/62926717/85370657-00096d00-b56a-11ea-94bb-7871f80edef5.PNG">


9. 여기서, 패키지 이름과 SHA-1 인증서 지문을 필요로 하는데   패키지 이름은 현재 만든 프로젝트의 MainActivity.java의 프로젝트를 말한다.     
<img width="264" alt="googleApi11" src="https://user-images.githubusercontent.com/62926717/85370772-31823880-b56a-11ea-884f-b2c886530f04.PNG">


10. SHA-1 인증서 지문을 받아오기 위해 윈도우 키 + R을 눌러 cmd을 입력하고 명령 프롬프트 창을 불러온다.    
<img width="300" alt="googleApi12" src="https://user-images.githubusercontent.com/62926717/85370892-668e8b00-b56a-11ea-83c6-74cca4a62e9b.PNG">


11. 윈도우에서는 다음 명령으로 SHA-1 인증서 지문을 획득할 수 있다.    

```
"C:\Program Files\Android\Android Studio\jre\bin\keytool" -list -v -keystore "%USERPROFILE%\.android\debug.keystore" -alias androiddebugkey -storepass android -keypass android
```


12. 사진에서 하얗게 표시한 부분인 SHA-1 옆에 있는 문자열을 복사한다.    
<img width="850" alt="googleApi13" src="https://user-images.githubusercontent.com/62926717/85371413-28de3200-b56b-11ea-9390-b0707cbf2362.PNG">


13. '완료'를 클릭한 뒤 '저장'을 클릭해준다.    
<img width="251" alt="googleApi14 완료 누르고 저장" src="https://user-images.githubusercontent.com/62926717/85371538-57f4a380-b56b-11ea-889c-6bdb067cf6ca.PNG">


14. Place API를 사용하는 경우에도 똑같은 방법으로 방금 복사한 SHA-1의 문자열을 입력하고 저장해준다.


15. 그리고 마지막으로 AndroidManifest.xml 파일에서 다음과 같이 코드를 추가한다.
```
<meta-data
            android:name="com.google.android.geo.API_KEY"
            android:value="API 키"/>
```


출처 : 멈춤보단 천천히라도      
https://webnautes.tistory.com/647

***



#### 하단버튼 만들기

#### bottom_nav_menu.xml


* bottom navigation을 사용한다.
* menu 레이아웃에서 사용할 갯수만큼 item을 추가한다.
```java
<item
        android:id="@+id/navigation_home"
        android:icon="@drawable/ic_home_white"
        android:title="@string/title_home" />
```




#### BottomActivity.java

* 각각의 Button에 연결되는 4개의 Fragment를 생성한다.
* 화면을 띄울 Activity를 생성한 후, Fragment 객체를 선언한다.
* menu 아이템이 선택될 때 호출될 Listener를 등록한다.
```java
 //5가지 fragment 객체 선언
    private HomeFragment homeFragment = new HomeFragment();
    private HeartFragment heartFragment = new HeartFragment();
    private PersonFragment personFragment = new PersonFragment();
    private StarFragment starFragment = new StarFragment();
    private DrinkFragment drinkFragment = new DrinkFragment();

  //처음 화면을 homefragment로 지정
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout,homeFragment).commitAllowingStateLoss();

   // 메뉴 아이템이 선택될때 호출될 리스너 등록
   // home, heart, person, star, drink 다섯가지 fragment
       navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                switch (menuItem.getItemId()){
                    case R.id.navigation_home:{
                        transaction.replace(R.id.frame_layout,homeFragment).commitAllowingStateLoss();
                        break;
                    }
```



#### activity_bottom.xml

* activity_bottom.xml 파일에는 Fragment를 띄울 FrameLayout과 하단 Button을 띄워줄    
BottomNavigationView를 생성해준다.
```java
<FrameLayout
        android:id="@+id/frame_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_marginBottom="?attr/actionBarSize"/>

    <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/nav_view"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="0dp"
        android:layout_marginEnd="0dp"
        android:background="?android:attr/windowBackground"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:menu="@menu/bottom_nav_menu" />
```



#### mobile_navigation.xml

* navigation 레이아웃에서 5가지 아이템의 Fragment를 선언하여 id를 부여한 후    
각각의 xml을 Layout에 넣어준다.
```java
<fragment
        android:id="@+id/navigation_home"
        android:name="com.example.rinkdproject.ui.home.HomeFragment"
        android:label="@string/title_home"
        tools:layout="@layout/fragment_home" />
```


#### 타이틀바 색상 바꾸기

#### style.xml
* 상태바 및 타이블바 등 App을 디자인하는데 필요한 코드들이 모여있다.
```java
<resources>
    <!-- Base application theme. -->
    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <!-- Customize your theme here. -->

         액션바(타이틀바)의 색상을 결정
        <item name="colorPrimary">#FFD4DF</item> 
         상태바(시간 및 LTE 보여주는 바)의 생상을 결정   
        <item name="colorPrimaryDark">#FFB6C1</item> 
         강조 색상을 표시함
        <item name="colorAccent">#dcdcdc</item> 
    </style>
```


#### 안드로이드 런처 아이콘 변경하기

#### ic_launcher_drink
```java
   <background android:drawable="@color/ic_launcher_drink_background"/>  
   <foreground android:drawable="@mipmap/ic_launcher_drink_foreground"/>
```


***

본격적으로 차근차근히 코드를 구현해보자.


***

### 홈 카테고리(지도)
#### 지도

* Manifest에 다음 권한(위치 정보 접근을 위한 퍼미션)을 등록한다.
```
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION“/>
<usespermission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
<uses-permission android:name="android.permission.INTERNET" />
```

* build.gradle > Module:app에 다음 코드를 Sync한다.

```
implementation 'com.google.android.gms:play-services-maps:17.0.0'
implementation 'com.google.android.gms:play-services-location:17.0.0'
```


#### MapActivity.java
* 지도'만' 코드가 너무 긴 관계로 주석으로 설명을 대신한다.
```java
public class MapActivity extends AppCompatActivity
        implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, LocationListener, OnMapReadyCallback,PlacesListener {

    private GoogleMap mMap;
    private Marker currentMarker = null;

    private static final String TAG = "googlemap_example";
    private static final int GPS_ENABLE_REQUEST_CODE = 2001;
    private static final int UPDATE_INTERVAL_MS = 1000;  // 1초
    private static final int FASTEST_UPDATE_INTERVAL_MS = 500; // 0.5초

    // onRequestPermissionsResult에서 수신된 결과에서 ActivityCompat.requestPermissions를 사용한 퍼미션 요청을 구별하기 위해 사용됩니다.
    private static final int PERMISSIONS_REQUEST_CODE = 100;
    boolean needRequest = false;


    // 앱을 실행하기 위해 필요한 퍼미션을 정의합니다.
    String[] REQUIRED_PERMISSIONS  = {Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION};  // 외부 저장소

    Location mCurrentLocatiion;
    LatLng currentPosition;


    private FusedLocationProviderClient mFusedLocationClient;
    private LocationRequest locationRequest;
    private Location location;

     // Snackbar 사용하기 위해서는 View가 필요합니다.
    private View mLayout;  

    List<Marker> previous_marker = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,
                WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_map);

        mLayout = findViewById(R.id.layout_main);

        locationRequest = new LocationRequest()
                .setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)
                .setInterval(UPDATE_INTERVAL_MS)
                .setFastestInterval(FASTEST_UPDATE_INTERVAL_MS);

        LocationSettingsRequest.Builder builder =
                new LocationSettingsRequest.Builder();

        builder.addLocationRequest(locationRequest);


        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        //현재 위치 및 주변 카페들 위치를 띄우주는 마커를 설정함
        previous_marker = new ArrayList<Marker>();

        //주변 카페 검색 버튼 리스트
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                mMap.clear();//지도 클리어
                if (previous_marker != null)
                    previous_marker.clear();//지역정보 마커 클리

                new NRPlaces.Builder()
                        .listener(MapActivity.this)

                        .key("AIzaSyCMuLQLIJiPwLDSrvqWrvOZAZTSvcWTpC8")

                        .latlng(currentPosition.latitude, currentPosition.longitude)//현재 위치

                        .radius(5000) //500 미터 내에서 검색

                        .type(PlaceType.CAFE) //카페

                        .build()

                        .execute();
            }
        });
    }

   //OnMapReadyCallback 인터페이스의 onMapReady 메소드를 구현해줘야 합니다. 지도가 준비가 완료가 된 상태에서 호출되어지는 메소드입니다. 
    @Override
    public void onMapReady(final GoogleMap googleMap) {
        Log.d(TAG, "onMapReady :");

        mMap = googleMap;

        //런타임 퍼미션 요청 대화상자나 GPS 활성 요청 대화상자 보이기 전에 지도의 초기위치를 서울로 이동
        setDefaultLocation();

        //런타임 퍼미션 처리
        // 1. 위치 퍼미션을 가지고 있는지 체크합니다.
        int hasFineLocationPermission = ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION);
        int hasCoarseLocationPermission = ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_COARSE_LOCATION);

        if (hasFineLocationPermission == PackageManager.PERMISSION_GRANTED &&
                hasCoarseLocationPermission == PackageManager.PERMISSION_GRANTED   ) {

            // 2. 이미 퍼미션을 가지고 있다면
            // 3. 위치 업데이트 시작
            startLocationUpdates(); 

        }else {  

            // 3-1. 사용자가 퍼미션 거부를 한 적이 있는 경우에는
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, REQUIRED_PERMISSIONS[0])) {

                // 3-2. 요청을 진행하기 전에 사용자가에게 퍼미션이 필요한 이유를 설명해줄 필요가 있습니다.
                Snackbar.make(mLayout, "이 앱을 실행하려면 위치 접근 권한이 필요합니다.",
                        Snackbar.LENGTH_INDEFINITE).setAction("확인", new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {

                        // 3-3. 사용자에게 퍼미션 요청을 하며 요청 결과는 onRequestPermissionResult에서 수신됩니다.
                        ActivityCompat.requestPermissions( MapActivity.this, REQUIRED_PERMISSIONS,
                                PERMISSIONS_REQUEST_CODE);
                    }
                }).show();


            } else {
                // 4-1. 사용자가 퍼미션 거부를 한 적이 없는 경우에는 퍼미션 요청을 바로 하며 요청 결과는 onRequestPermissionResult에서 수신됩니다.
                ActivityCompat.requestPermissions( this, REQUIRED_PERMISSIONS,
                        PERMISSIONS_REQUEST_CODE);
            }

        }


        mMap.getUiSettings().setMyLocationButtonEnabled(true);
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {

            @Override
            public void onMapClick(LatLng latLng) {

                Log.d( TAG, "onMapClick :");
            }
        });
    }

   //경도와 위도를 포함한 위치들을 불러옵니다.
    LocationCallback locationCallback = new LocationCallback() {
        @Override
        public void onLocationResult(LocationResult locationResult) {
            super.onLocationResult(locationResult);

            List<Location> locationList = locationResult.getLocations();

            if (locationList.size() > 0) {
                location = locationList.get(locationList.size() - 1);
                //location = locationList.get(0);

                currentPosition
                        = new LatLng(location.getLatitude(), location.getLongitude());


                String markerTitle = getCurrentAddress(currentPosition);
                String markerSnippet = "위도:" + String.valueOf(location.getLatitude())
                        + " 경도:" + String.valueOf(location.getLongitude());

                Log.d(TAG, "onLocationResult : " + markerSnippet);


                //현재 위치에 마커 생성하고 이동합니다.
                setCurrentLocation(location, markerTitle, markerSnippet);

                mCurrentLocatiion = location;
            }


        }

    };


    //지도가 켜지면서 위치를 불러옵니다. 
    private void startLocationUpdates() {

        if (!checkLocationServicesStatus()) {

            Log.d(TAG, "startLocationUpdates : call showDialogForLocationServiceSetting");
            showDialogForLocationServiceSetting();
        }else {

            int hasFineLocationPermission = ContextCompat.checkSelfPermission(this,
                    Manifest.permission.ACCESS_FINE_LOCATION);
            int hasCoarseLocationPermission = ContextCompat.checkSelfPermission(this,
                    Manifest.permission.ACCESS_COARSE_LOCATION);



            if (hasFineLocationPermission != PackageManager.PERMISSION_GRANTED ||
                    hasCoarseLocationPermission != PackageManager.PERMISSION_GRANTED   ) {

                Log.d(TAG, "startLocationUpdates : 퍼미션 안가지고 있음");
                return;
            }


            Log.d(TAG, "startLocationUpdates : call mFusedLocationClient.requestLocationUpdates");

            mFusedLocationClient.requestLocationUpdates(locationRequest, locationCallback, Looper.myLooper());

            if (checkPermission())
                mMap.setMyLocationEnabled(true);

        }

    }


    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart");

        if (checkPermission()) {

            Log.d(TAG, "onStart : call mFusedLocationClient.requestLocationUpdates");
            mFusedLocationClient.requestLocationUpdates(locationRequest, locationCallback, null);

            if (mMap!=null)
                mMap.setMyLocationEnabled(true);

        }


    }


    @Override
    protected void onStop() {

        super.onStop();

        if (mFusedLocationClient != null) {

            Log.d(TAG, "onStop : call stopLocationUpdates");
            mFusedLocationClient.removeLocationUpdates(locationCallback);
        }
    }




    public String getCurrentAddress(LatLng latlng) {

        //지오코더를 통해서 GPS를 주소로 변환
        Geocoder geocoder = new Geocoder(this, Locale.getDefault());

        List<Address> addresses;

        try {
            addresses = geocoder.getFromLocation(
                    latlng.latitude,
                    latlng.longitude,
                    1);

        } catch (IOException ioException) {

            //네트워크 문제가 발생했을 때는 지오코더를 사용할 수 없습니다.
            Toast.makeText(this, "지오코더 서비스 사용불가", Toast.LENGTH_LONG).show();
            return "지오코더 서비스 사용불가";

        } catch (IllegalArgumentException illegalArgumentException) {
            Toast.makeText(this, "잘못된 GPS 좌표", Toast.LENGTH_LONG).show();
            return "잘못된 GPS 좌표";

        }


        if (addresses == null || addresses.size() == 0) {
            Toast.makeText(this, "주소 미발견", Toast.LENGTH_LONG).show();
            return "주소 미발견";

        } else {
            Address address = addresses.get(0);
            return address.getAddressLine(0).toString();
        }

    }


    public boolean checkLocationServicesStatus() {
        LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)
                || locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
    }


    public void setCurrentLocation(Location location, String markerTitle, String markerSnippet) {


        if (currentMarker != null) currentMarker.remove();


        LatLng currentLatLng = new LatLng(location.getLatitude(), location.getLongitude());

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(currentLatLng);
        markerOptions.title(markerTitle);
        markerOptions.snippet(markerSnippet);
        markerOptions.draggable(true);


        currentMarker = mMap.addMarker(markerOptions);


         //moveCamera 메소드를 사용하여 카메라를 지정한 경도, 위도로 이동합니다. 
        //CameraUpdateFactory.zoomTo 메소드를 사용하여 지정한 단계로 카메라 줌을 조정합니다.
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLng(currentLatLng);
        mMap.moveCamera(cameraUpdate);

    }


    public void setDefaultLocation() {


        //MarkerOptions으로 마커가 표시될 위치, 마커에 표시될 타이틀, 마커 클릭시 보여주는 간단한 설명를 설정하고 addMarker 메소드로 GoogleMap 객체에 추가해주면 지도에 표시된다.
        LatLng DEFAULT_LOCATION = new LatLng(37.56, 126.97);
        String markerTitle = "위치정보 가져올 수 없음";
        String markerSnippet = "위치 퍼미션과 GPS 활성 요부 확인하세요";


        if (currentMarker != null) currentMarker.remove();

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(DEFAULT_LOCATION);
        markerOptions.title(markerTitle);
        markerOptions.snippet(markerSnippet);
        markerOptions.draggable(true);
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        currentMarker = mMap.addMarker(markerOptions);

       //줌한 숫자가 커질수록 상세지도가 보입니다. 
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(DEFAULT_LOCATION, 15);
        mMap.moveCamera(cameraUpdate);

    }


    //런타임 퍼미션 처리을 위한 메소드들
    private boolean checkPermission() {

        int hasFineLocationPermission = ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION);
        int hasCoarseLocationPermission = ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_COARSE_LOCATION);

        if (hasFineLocationPermission == PackageManager.PERMISSION_GRANTED &&
                hasCoarseLocationPermission == PackageManager.PERMISSION_GRANTED   ) {
            return true;
        }

        return false;

    }


   // ActivityCompat.requestPermissions를 사용한 퍼미션 요청의 결과를 리턴받는 메소드입니다.
    @Override
    public void onRequestPermissionsResult(int permsRequestCode,
                                           @NonNull String[] permissions,
                                           @NonNull int[] grandResults) {

        if ( permsRequestCode == PERMISSIONS_REQUEST_CODE && grandResults.length == REQUIRED_PERMISSIONS.length) {

            // 요청 코드가 PERMISSIONS_REQUEST_CODE 이고, 요청한 퍼미션 개수만큼 수신되었다면

            boolean check_result = true;


            // 모든 퍼미션을 허용했는지 체크합니다.
            for (int result : grandResults) {
                if (result != PackageManager.PERMISSION_GRANTED) {
                    check_result = false;
                    break;
                }
            }


            if ( check_result ) {

                // 퍼미션을 허용했다면 위치 업데이트를 시작합니다.
                startLocationUpdates();
            }
            else {

                // 거부한 퍼미션이 있다면 앱을 사용할 수 없는 이유를 설명해주고 앱을 종료합니다.2 가지 경우가 있습니다.

                if (ActivityCompat.shouldShowRequestPermissionRationale(this, REQUIRED_PERMISSIONS[0])
                        || ActivityCompat.shouldShowRequestPermissionRationale(this, REQUIRED_PERMISSIONS[1])) {


                    // 사용자가 거부만 선택한 경우에는 앱을 다시 실행하여 허용을 선택하면 앱을 사용할 수 있습니다.
                    Snackbar.make(mLayout, "퍼미션이 거부되었습니다. 앱을 다시 실행하여 퍼미션을 허용해주세요. ",
                            Snackbar.LENGTH_INDEFINITE).setAction("확인", new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {

                            finish();
                        }
                    }).show();

                }else {


                    // "다시 묻지 않음"을 사용자가 체크하고 거부를 선택한 경우에는 설정(앱 정보)에서 퍼미션을 허용해야 앱을 사용할 수 있습니다.
                    Snackbar.make(mLayout, "퍼미션이 거부되었습니다. 설정(앱 정보)에서 퍼미션을 허용해야 합니다. ",
                            Snackbar.LENGTH_INDEFINITE).setAction("확인", new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {

                            finish();
                        }
                    }).show();
                }
            }

        }
    }


    //GPS 활성화를 위한 메소드들
    private void showDialogForLocationServiceSetting() {

        AlertDialog.Builder builder = new AlertDialog.Builder(MapActivity.this);
        builder.setTitle("위치 서비스 비활성화");
        builder.setMessage("앱을 사용하기 위해서는 위치 서비스가 필요합니다.\n"+ "위치 설정을 수정하실래요?");
        builder.setCancelable(true);
        builder.setPositiveButton("설정", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                Intent callGPSSettingIntent
                        = new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivityForResult(callGPSSettingIntent, GPS_ENABLE_REQUEST_CODE);
            }
        });
        builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        builder.create().show();
    }

   //호출한 activity에서 결과 받기 
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {

            case GPS_ENABLE_REQUEST_CODE:

                //사용자가 GPS 활성 시켰는지 검사
                if (checkLocationServicesStatus()) {
                    if (checkLocationServicesStatus()) {

                        Log.d(TAG, "onActivityResult : GPS 활성화 되있음");

                        needRequest = true;

                        return;
                    }
                }

                break;
        }
    }

    //위치 정보를 가져올 수 있는 메소드입니다.
    //위치 이동이나 시간 경과 등으로 인해 호출됩니다.
    //최신 위치는 location 파라메터가 가지고 있습니다.
    //최신 위치를 가져오려면, location 파라메터를 이용하면 됩니다.
    @Override
    public void onLocationChanged(Location location) {

    }
   
    //위치 공급자가 사용 불가능해질(disabled) 때 호출 됩니다.
    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

   //위치 공급자의 상태가 바뀔 때 호출 됩니다..
    @Override
    public void onProviderEnabled(String provider) {

    }

    //위치 공급자가 사용 불가능해질(disabled) 때 호출 됩니다.
    @Override
    public void onProviderDisabled(String provider) {

    }

   //연결 성공
    @Override
    public void onConnected(@Nullable Bundle bundle) {

    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    @Override
    public void onPlacesFailure(PlacesException e) {

    }

    @Override
    public void onPlacesStart() {

    }


    //카페 위치에 마커를 띄워줄 메소드 생성한다
    @Override
    public void onPlacesSuccess(final List<Place> places) {
        Log.i("PlacesAPI", "onPlacesSuccess()");
        runOnUiThread(new Runnable() {

            @Override

            public void run() {

                for (noman.googleplaces.Place place : places) {
                    LatLng latLng = new LatLng(place.getLatitude(), place.getLongitude());
                    MarkerOptions markerOptions = new MarkerOptions();
                    markerOptions.position(latLng);
                    markerOptions.title(place.getName());
                    markerOptions.snippet(place.getVicinity());
                    Marker item = mMap.addMarker(markerOptions);
                    previous_marker.add(item);
                }
                //중복 마커 제거
                HashSet<Marker> hashSet = new HashSet<Marker>();
                hashSet.addAll(previous_marker);
                previous_marker.clear();
                previous_marker.addAll(hashSet);
            }

        });
    }

    @Override
    public void onPlacesFinished() {

    }
}
```
***

### 홈 카테고리(추천 음료)

#### button_background.xml
* 버튼의 내부 색상 및 테두리 색상을 설정하고 모서리를 둥글게 만드는 등 버튼을 커스텀 한다.
```java
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"

    10dp 만큼 
    android:padding="10dp"

    각 모서리에 
    android:shape="rectangle" >
     
    버튼 내부색을 설정한다.
    <solid android:color="#FFE3EE" />

    사각형의 각 모서리 부분을 둥글게 만든다.
    <corners
        
        //좌측 하단에 12dp에 해당하는만큼 둥글게 만듦
        android:bottomLeftRadius="12dp"
        
        //우측 하단에 12dp에 해당하는만큼 둥글게 만듦
        android:bottomRightRadius="12dp"

        //좌측 상단에 12dp에 해당하는만큼 둥글게 만듦
        android:topLeftRadius="12dp"

        //우측 상단에 12dp에 해당하는만큼 둥글게 만듦
        android:topRightRadius="12dp" />

    테두리 색과 두께 지정
    <stroke
        android:width="1dp"
        android:color="#FFE3EE" />
</shape>
```

#### fagment_home.xml
* 지도 Activity로 넘어가는 버튼, 랜덤 음료를 보여주는 Activity로 넘어가는 페이지로 넘어간다.
```java
// 지도 페이지로 넘어가는 버튼 
        <Button
            android:id="@+id/mapbutton"
            android:layout_width="wrap_content"
            android:layout_height="23dp"
            android:background="@drawable/mapmapbutton"
            android:text="확인해봐"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent" />


        // 10장의 랜덤 음료를 보여주는 페이지로 넘어감
        <Button
            android:id="@+id/searchbutton"
            android:layout_width="wrap_content"
            android:layout_height="23dp"
            android:background="@drawable/mapmapbutton"
            android:text="결정해봐"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

   //View FLipper는 자동 페이징과 탭해서 뷰를 넘기는 분야를 가진다.
   //여기서 자동 페이징 기능은 처음 터치된 곳의 이벤트 값과 나중에 선택된 곳의 이벤트 값의 차이를 계산하여 띄우는 것이다. 

    <ViewFlipper
        android:id="@+id/flipper"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
    </ViewFlipper>
```


#### HomeFragment.java
* MapActivity.java와 연결 되어있다.

```java
Button btn_go =(Button)rootview.findViewById(R.id.mapbutton);

        //mapbutton 클릭 시 map activity로 이동하여 현재 나의 위치 및 카페들을 띄워준다. 
        btn_go1.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), DrinkSearch.class);

                        startActivity(intent);
                    }
                }
        );

        //ViewFlipper 객체를 참조한다.
        final ViewFlipper flipper = (ViewFlipper)rootview.findViewById(R.id.flipper);


        //onClick속성이 지정된 View가 클릭되었을 때 자동으로 호출되는 메소드.(이전의 이미지로 바뀜)
        Button btn_previous = (Button)rootview.findViewById(R.id.btn_previous);
        btn_previous.setOnClickListener(
                new ImageButton.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(getActivity(), HomeFragment.class);

                        //이전 View로 교체
                        flipper.showPrevious();                 
                    }
                }

        );

        //onClick속성이 지정된 View가 클릭되었을 때 자동으로 호출되는 메소드.(이후의 이미지로 바뀜)
        Button btn_next = (Button)rootview.findViewById(R.id.btn_next);
        btn_next.setOnClickListener(
                new ImageButton.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(getActivity(), HomeFragment.class);

                         //다음 View로 교체
                        flipper.showNext();   
```


***

### 프랜차이즈 카테고리(프랜차이즈 목록 띄우기)

#### Cafe.java

* 아이템 클래스(Cafe.java)와 어댑터 클래스(CafeAdapter.java)를 생성한다.    
* 아이템 클래스에 이미지, 이름을 받아올 생성자와 get/set 메소드를 만들어준다. (*반환형 주의*)

```java
String name;
    int image;
    Intent intent;
    
    public Cafe(int image, String name) {
        this.image = image;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getImage(){
        return image;
    }
    public Intent getIntent(){
        return intent;
    }
```


#### CafeAdapter

* recyclerView를 상속받기 전에, build.gradle > Module:app에 다음과 같이 코드를 추가하고 Sync해준다.

```
implementation 'androidx.recyclerview:recyclerview:1.1.0'
```

* recyclerView를 상속받는 Adapter를 생성해준다.   
* OnCafeItemClickListener 인터페이스를 구현한다.


```java
public class CafeAdapter extends RecyclerView.Adapter<CafeAdapter.ViewHolder> implements OnCafeItemClickListener {
``` 

* Adapter 클래스에 아이템들을 받아줄 ArrayList와 CilckListener를 선언해준다.


```java
ArrayList<Cafe> items = new ArrayList<Cafe>();
OnCafeItemClickListener listener;
``` 

* 아이템 뷰를 ViewHolder에 저장해준다.     
```java
public void onBindViewHolder(@NonNull ViewHolder viewholder, int position) {
        Cafe item = items.get(position);
        viewholder.setItem(item);
    }
```

* 프랜차이즈 로고 사진을 받아올 imageView와 매장 이름을 표시해줄 TextView를 선언한다.    
* findViewById를 사용해 xml레이아웃에서 정의한 view를 참조해준다.   
* 아이템 position을 받아와 아이템 뷰 ClickListener도 설정해준다.


```java
public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public ViewHolder(View itemView, final OnCafeItemClickListener listener){
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if(listener != null){
                        listener.onItemClick(ViewHolder.this,view,position);
                    }
                }
            });
        }
        public void setItem(Cafe item){
            textView.setText(item.getName());
            imageView.setImageResource(item.getImage());
        }
    }
```




#### StarFragment.java

* 아이템들을 나열해서 보여줄 recyclerView를 선언한 후 레이아웃에서 정의한 view를 참조한다.    
* GridLayout을 사용해 한줄에 3개씩 아이템을 나열하도록 설정해준다.


```java
RecyclerView recyclerView = view.findViewById(R.id.layout1);

        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),3);
        recyclerView.setLayoutManager(layoutManager);
```


* 아이템들을 받아줄 CafeAdapter를 선언한다.


```java
final CafeAdapter adapter = new CafeAdapter();
```


* addItem 메소드를 사용하여 recyclerView에 띄울 Adapter에 image,textview를 저장해준다.    
* 이때 카페 로고의 이미지는 drawable에 저장한 후 불러온다.


```java
adapter.addItem(new Cafe(R.drawable.venti,"더 벤티"));
        adapter.addItem(new Cafe(R.drawable.bbaek,"빽다방"));
        adapter.addItem(new Cafe(R.drawable.palgong,"팔공티"));
        adapter.addItem(new Cafe(R.drawable.chayam,"차얌"));
        recyclerView.setAdapter(adapter);
```


* switch문을 사용해 ClickEvent를 만들고 아이템을 클릭했을 때 해당 Cafe.java Activity로 이동하도록 설정한다.    
* position으로 아이템 구분   
* Intent 사용하여 Activity로 전환한다.


```java
adapter.setOnItemClickListener(new OnCafeItemClickListener() {
            @Override
            public void onItemClick(CafeAdapter.ViewHolder holder, View view, int position) {
                Cafe item = adapter.getItem(position);
                switch (position){
                    case 0:
                        Intent intent = new Intent(getActivity(), GongchaActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent2 = new Intent(getActivity(), EdiyaActivity.class);
                        startActivity(intent2);
                        break
```

* OnCafeItemClickListener 인터페이스를 생성한다.
```java
public interface OnCafeItemClickListener {
    public void onItemClick(CafeAdapter.ViewHolder holder, View view, int position);
}
```



#### Layout1.xml

* 프랜차이즈 로고 사진과 카페 이름을 띄워줄 아이템 레이아웃을 생성한다.   
* CardView를 사용해 imageview와 textview를 깔끔하게 정리한다.    
* 이때 image와 text는 LinearLayout vertical로 정의한다.


```java
<androidx.cardview.widget.CardView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:cardBackgroundColor="#FFFFFFFF"
        app:cardCornerRadius="10dp"
        app:cardElevation="5dp"
        app:cardUseCompatPadding="true">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:orientation="vertical">

            <ImageView
                android:id="@+id/imageView"
                android:layout_margin="5dp"
                android:layout_width="match_parent"
                android:layout_height="90dp" />

            <TextView
                android:id="@+id/textView"
                android:layout_margin="5dp"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:gravity="center" />

        </LinearLayout>
    </androidx.cardview.widget.CardView>
```


#### fragment_star.xml

* Fragment의 xml 레이아웃에는 FrameLayout 안에 아이템을 나열해줄 recyclerview를 생성한다.


```java
<FrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <androidx.recyclerview.widget.RecyclerView
            android:id="@+id/layout1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />

    </FrameLayout>
```



***


#### Firebase 연결

1. build.gradle > Moduel:app에 다음 코드를 추가하고 Sync한다.
```
implementation 'com.google.firebase:firebase-database:19.3.1'
implementation 'com.google.firebase:firebase-storage:19.1.1'
implementation 'com.firebaseui:firebase-ui-storage:3.2.2'
implementation 'com.github.bumptech.glide:glide:4.10.0'
annotationProcessor 'com.github.bumptech.glide:compiler:4.10.0'
```

2. 안드로이드 스튜디오에서 상단바에 있는 Tools을 선택하고 Firebase를 클릭한다.
<img width="600" alt="firebase2" src="https://user-images.githubusercontent.com/62926717/85379095-567ca880-b576-11ea-8825-dafc6c9bc30b.PNG">

3. Firebase assistant창 에서 firebase와 연동하기 위해 'Realtime Database'를 선택하고 Save and retrieve data를 클릭한다.
<img width="600" alt="firebase3" src="https://user-images.githubusercontent.com/62926717/85379925-474a2a80-b577-11ea-8652-93f7f065d86a.PNG">


4. 1,2번 둘 다 연결이 되지않은 상태이므로 차례대로 1번 'Connect to Firebase'를 클릭한다.
<img width="600" alt="firebase4" src="https://user-images.githubusercontent.com/62926717/85380786-4a91e600-b578-11ea-8cbd-bc41b7a8c97d.PNG">


5. Connect to Firebase를 클릭한다.
<img width="600" alt="firebase5" src="https://user-images.githubusercontent.com/62926717/85384197-dce7b900-b57b-11ea-8779-73b25c7c364c.PNG">


6. 잠깐의 시간이 지나면 1번이 연결되는데 성공한다.
<img width="600" alt="firebase7" src="https://user-images.githubusercontent.com/62926717/85384335-03a5ef80-b57c-11ea-99da-6a5b600fd243.PNG">


7. 2번도 눌러서 마저 연결해준다.
<img width="600" alt="firebase8" src="https://user-images.githubusercontent.com/62926717/85384534-3354f780-b57c-11ea-969a-8fe2f5f3a9ea.PNG">


8. 1,2번 모두 사진처럼 성공적으로 연결이 되었다면
<img width="600" alt="firebase9" src="https://user-images.githubusercontent.com/62926717/85384834-8169fb00-b57c-11ea-9bc1-858ba3fd2c04.PNG">


9. 검색창에 '구글 파이어베이스 콘솔'을 검색하고 사이트에 접속한다.
<img width="600" alt="firebase10" src="https://user-images.githubusercontent.com/62926717/85384968-b5452080-b57c-11ea-851e-e782d4696e57.PNG">


10. 파이어베이스에 연결한 프로젝트 명으로 들어간다.
<img width="600" alt="firebase11" src="https://user-images.githubusercontent.com/62926717/85385169-f0dfea80-b57c-11ea-8780-dcfaf2c6be3f.PNG">


11. Database를 클릭한다.
<img width="300" alt="firebase12" src="https://user-images.githubusercontent.com/62926717/85385220-005f3380-b57d-11ea-8b51-73c680cee9a7.PNG">

12. '데이터베이스 만들기'를 클릭, 테스터 모드로 시작하고 '사용 설정'을 클릭한다.
<img width="600" alt="firebase14" src="https://user-images.githubusercontent.com/62926717/85385644-854a4d00-b57d-11ea-814c-3e3b2158bc97.PNG">

13. 파이어베이스에 (예시)다음 사진과 같이 DB를 추가한다.
<img width="600" alt="firebase15" src="https://user-images.githubusercontent.com/62926717/85385794-add24700-b57d-11ea-9ca4-71ca1e009fcb.PNG">


14. 이미지 파일을 첨부할 수 있는 Storage를 클릭해 '시작하기'를 클릭한다.
<img width="400" alt="firebase16" src="https://user-images.githubusercontent.com/62926717/85386197-3fda4f80-b57e-11ea-93f8-e86136562d76.PNG">


15. Storage의 rule(규칙)으로 들어가 다음과 같이 코드를 수정한다.
<img width="400" alt="firebase20" src="https://user-images.githubusercontent.com/62926717/85386374-7fa13700-b57e-11ea-9e73-a300ed27d7ff.PNG">


16. '파일 업로드'를 눌러 PC안에 있는 이미지 하나를 선택하면 다음과 같이 파일을 업로드한다.
<img width="400" alt="firebase22" src="https://user-images.githubusercontent.com/62926717/85386522-ad867b80-b57e-11ea-8a07-0160cdee05c7.PNG">


17. 파일을 클릭하면 사진의 이미지와 주소를 불러올 수 있다.
<img width="800" alt="firebase23" src="https://user-images.githubusercontent.com/62926717/85386608-c858f000-b57e-11ea-8c36-28d740e802fe.PNG">


18. 파일 위치에서 엑세스 토큰을 클릭하면 이미지의 주소를 받아온다.
<img width="400" alt="firebase24" src="https://user-images.githubusercontent.com/62926717/85386910-24237900-b57f-11ea-9b70-c62c567cc5c6.PNG">


19. 다음과 같이 이미지 주소를 넣으면 이미지 주소를 불러올 수 있다.
<img width="400" alt="firebase25" src="https://user-images.githubusercontent.com/62926717/85387128-66e55100-b57f-11ea-8e52-6d849b31d1e4.PNG">

***


### 음료 카테고리


#### DrinkFragment.java

* 가장 큰 틀로 DrinkFragment 파일에 TabLayout을 사용하여 ICE/HOT 탭을 생성한다.    
* addTab을 사용해 두 개의 탭을 생성한다.    
* xml에서 만든 탭 레이아웃에 대한 view를 참조해준다.

* Viewpager를 사용하여 각 탭에 해당하는 Fragment를 띄운다.   
* Viewpager를 사용하면 스크롤로 화면을 좌,우로 넘김이 가능하다.   

* adapter 객체를 만들어 Viewpager와 연결한다. (*adapter 관련 설명 이하 기록*)
* pageOnchangeListener를 등록해준다.
```java
public class DrinkFragment extends Fragment {
    private ViewPager mViewPager;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_drink, container, false);
        mViewPager  =(ViewPager)view.findViewById(R.id.viewPager);

        //tablayout을 설정해준다
        // ICE와 HOT 두가지 탭을 생성해주었다.
        TabLayout tabLayout = (TabLayout)view.findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("ICE"));
        tabLayout.addTab(tabLayout.newTab().setText("HOT"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Viewpager객체를 만들어서 xml파일의 viewpager 레이아웃을 가져온다.
        //Adapter 객체를 만들어서 viewpager 와 연결해준다.
        final ViewPager viewpager =(ViewPager)view.findViewById(R.id.viewPager);
        final PagerAdapter adapter = new PagerAdapter
                (getChildFragmentManager(),tabLayout.getTabCount());
        viewpager.setAdapter(adapter);
        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab){
                viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public  void onTabUnselected(TabLayout.Tab tab){

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });

        return view;
    }
```


* Adapter를 생성하여 각 탭에 프래그먼트를 연결한다.    
* 이때 클래스는 FragmentPagerAdapter를 상속받는다.   
* 사용할 탭의 갯수에 맞춰 Fragment 파일을 생성한다.   
* 탭에 position을 받아와 switch문을 사용해 각 탭에 Fragment를 리턴해준다.
```java
 private class PagerAdapter extends FragmentPagerAdapter{
        int mNumOfTabs;

        public PagerAdapter(FragmentManager fm, int NumOfTabs){
            super(fm);
            this.mNumOfTabs=NumOfTabs;
        }
        //getItem메서드를 생성하여 해당 프래그먼트를 각각의 tab화면에 표시하도록 해준다.
        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    FirstFragment tab1 = new FirstFragment();
                    return tab1;
                case 1:
                    SecondFragment tab2 = new SecondFragment();
                    return tab2;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return mNumOfTabs;
        }
```



#### FirstFragment.java

* ICE탭을 눌렀을 때 화면에 나타나는 화면을 위한 Fragment이다. (*SecondFragment.java 파일도 이와 같다.*)      
* 이 화면에서는 ExpandableListView를 사용하여 부모 리스트에 속한 자식 리스트를 만들어주어 많은 카테고리를 접었다 펼 수 있는 기능을 사용한다.

* 부모,자식 메뉴들을 담아줄 List들을 각각 선언한 후, 부모 리스트에 들어갈 요소들을 추가한다.   
* 이때 List는 HashMap 클래스를 사용한다.   
* 요소들을 하나의 그룹으로 묶어 해당 요소들의 텍스트를 적어준다.   
* 앞서 선언해준 부모 리스트에 생성한 그룹 요소들을 저장한다.    


```java
public class FirstFragment extends Fragment {
    private RecyclerView recyclerview;
    ExpandableListView listMain;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fistfragment, container, false);

        //부모 리스트와 자식 리스트를 선언해준다.
        ArrayList<HashMap<String,String>> groupData = new ArrayList<>();
        ArrayList<ArrayList<HashMap<String,String>>> childData = new ArrayList<>();

        //부모 리스트에 들어갈 요소들을 추가해준다.
        HashMap<String,String> groupA = new HashMap<>();
        groupA.put("group","COFFEE");
        HashMap<String,String> groupB = new HashMap<>();
        groupB.put("group","BEVERAGE");
        HashMap<String,String> groupC = new HashMap<>();
        groupC.put("group","TEA");
        HashMap<String,String> groupD = new HashMap<>();
        groupD.put("group","SMOOTHIE & FRAPPE");
        HashMap<String,String> groupE = new HashMap<>();
        groupE.put("group","ADE & JUICE");
        HashMap<String,String> groupF = new HashMap<>();
        groupF.put("group","BUBBLE TEA");

        groupData.add(groupA);
        groupData.add(groupB);
        groupData.add(groupC);
        groupData.add(groupD);
        groupData.add(groupE);
        groupData.add(groupF);
```


* 부모 요소들을 선언했다면 자식 리스트에 들어갈 요소를 추가한다.      
* 자식 요소들 또한 HashMap을 사용하며 부모 그룹명과 자식 요소 각각의 이름을 저장한다.    
* 요소들을 하나의 그룹으로 묶어 해당 요소들의 텍스트를 적어준다.   
* 아래의 코드는 하나의 부모 자식 리스트를 예로 든 것이다.
```java
 ArrayList<HashMap<String,String>>childListA = new ArrayList<>();

        HashMap<String,String> childAA = new HashMap<>();
        childAA.put("group","COFFEE");
        childAA.put("name", "아메리카노");
        childListA.add(childAA);

        HashMap<String,String> childAB = new HashMap<>();
        childAB.put("group","COFFEE");
        childAB.put("name", "카페라떼");
        childListA.add(childAB);

        HashMap<String,String> childAC = new HashMap<>();
        childAC.put("group","COFFEE");
        childAC.put("name", "카페모카");
        childListA.add(childAC);

        HashMap<String,String> childAD = new HashMap<>();
        childAD.put("group","COFFEE");
        childAD.put("name", "바닐라라떼");
        childListA.add(childAD);

        HashMap<String,String> childAE = new HashMap<>();
        childAE.put("group","COFFEE");
        childAE.put("name", "카라멜 마끼아또");
        childListA.add(childAE);

        HashMap<String,String> childAF = new HashMap<>();
        childAF.put("group","COFFEE");
        childAF.put("name", "카푸치노");
        childListA.add(childAF);

        HashMap<String,String> childAO = new HashMap<>();
        childAO.put("group","COFFEE");
        childAO.put("name", "아인슈패너");
        childListA.add(childAO);

        HashMap<String,String> childAJ = new HashMap<>();
        childAJ.put("group","COFFEE");
        childAJ.put("name", "아포가토");
        childListA.add(childAJ);

        HashMap<String,String> childAL= new HashMap<>();
        childAL.put("group","COFFEE");
        childAL.put("name", "디카페인");
        childListA.add(childAL);


        childData.add(childListA);
```

* 자식 요소 뷰 를 클릭하면 해당 음료 Activity로 전환하는 Listener를 생성한다.   
* 이때 GroupPosition 별로 switch문을 작성한다.   
* 작성한 부모 그룹 요소를 바탕으로 음료별 Activity를 생성한다.


![image](https://user-images.githubusercontent.com/62926717/85389919-0ce68a80-b583-11ea-89f9-68bb15adbf85.png)


* 클래스 내부에 어댑터를 생성한 후 ExpandableListView에 어댑터를 설정한다.
```java
SimpleExpandableListAdapter adapter  = new SimpleExpandableListAdapter(
                getContext(), groupData,android.R.layout.simple_expandable_list_item_1,
                new String[] {"group"},new int[] {android.R.id.text1},
                childData, android.R.layout.simple_expandable_list_item_2,new String[] {"name","group"},new int[]
                {android.R.id.text1,android.R.id.text2});

        //ExpandableListView에 생성한 Adapter를 설정한다.
        ExpandableListView listView = (ExpandableListView) view.findViewById(R.id.expandableListView);
        listView.setAdapter(adapter);
```


```
아메리카노 Activity를 대표적으로 살펴보자면
```


* 아메리카노 Activity 안에서도 아메리카노와 콜드브루를 나누어준다.   
* 예를 들어, 과일라떼 Activity로 본다면 '딸기','사과','복숭아' 등 과일의 종류별로 Fragment를 만들어준다.    
* TabLayout을 생성해 Viewpager로 나타낸다.


![image](https://user-images.githubusercontent.com/62926717/85390148-5afb8e00-b583-11ea-8f17-1356168b2fe3.png)


#### AmericanoIceActivity.java

* 필요한 객체들을 선언한다.   
* 이때 이미지와 텍스트들은 리사이클러뷰로 나타낼 것이며,

이 데이터들을 Firebase에 저장된 데이터들을 불러와 저장한다.    
```java
public class AmericanoIceActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Drink> arrayList;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    TextView textView;

    private ViewPager viewPager;
```


* 두 개의 탭, Viewpager를 생성한다.   
* 위에서 설명했듯이 만들고자 하는 Activity안에 세부적으로 음료 종류를 나눠야 한다면

종류별 개수만큼 탭을 생성해준다.
```java
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        tabLayout.addTab(tabLayout.newTab().setText("아메리카노"));
        tabLayout.addTab(tabLayout.newTab().setText("콜드브루"));

        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final ViewPager viewpager = (ViewPager) findViewById(R.id.viewPager);
        final AmericanoIceActivity.PagerAdapter adapter = new AmericanoIceActivity.PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewpager.setAdapter(adapter);
        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
    }
```

```java
private class PagerAdapter extends FragmentPagerAdapter {
        int mNumOfTabs;

        public PagerAdapter(FragmentManager fm, int NumOfTabs) {
            super(fm);
            this.mNumOfTabs = NumOfTabs;
        }

        //getItem메서드를 생성하여 해당 프래그먼트를 각각의 tab화면에 표시하도록 해준다.
        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    AmericanoFragment tab1 = new AmericanoFragment();
                    return tab1;
                case 1:
                    AmeColdbrewFragment tab2 = new AmeColdbrewFragment();
                    return tab2;
                default:
                    return null;
            }
        }


        @Override
        public int getCount() {
            return mNumOfTabs;
        }
```
* 어댑터를 생성하고 각각의 탭에 아메리카노, 콜드브루 Fragment를 연결한다.   
* 이 탭에 연결될 Fragment들은 모든 카페의 음료들을 가격순으로 띄워주는 화면이다.   
* 음료 정보들은 Firebase에서 받아올 것이므로 그 이전에   

#### Drink.java
#### DrinkAdapter.java

* 이 두 개의 클래스를 생성한다.



#### Drink.java
* Drink 클래스에는 필요한 정보를 받아줄 수 있는 객체를 선언한다.   
* 이미지, 카페 매장명, 음료 이름, 가격 객체를 생성한다.   
* 가격은 price, textprice 두 가지 이다.

* price : 반환형은 int. 숫자를 받아와 올림차순으로 정렬하기 위한 변수   
* textprice : 반환형은 string으로 문자열을 받아와 가격을 textview로 나타내기 위한 변수


```java
public class Drink {
    private String image;
    private String cafename;
    private String drinkname;
    private int price;
    private String textprice;

    public Drink(){}

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCafename() {
        return cafename;
    }

    public void setCafename(String cafename) {
        this.cafename = cafename;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDrinkname(){
        return drinkname;
    }

    public void setDrinkname(String drinkname){
        this.drinkname = drinkname;
    }

    public String getTextprice() {return textprice;}
    public void setTextprice(String textprice){this.textprice = textprice;}

}
```

#### DrinkAdapter.java

* Drink객체를 담을 리스트를 선언한다.   
* LayoutInflater를 사용해서 recyclerview로 띄울 아이템 레이아웃 파일을 참조한다.

```java
public class DrinkAdapter extends RecyclerView.Adapter<DrinkAdapter.CustomViewHolder> {

    private ArrayList<Drink> arrayList;
    private Context context;

    public DrinkAdapter(ArrayList<Drink> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.drink_item,parent,false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }
```


* 어댑터를 통해 만들어진 객체들을 리스트에 저장하고 ViewHolder에 저장한다.   
* 이미지뷰는 Glide를 사용하여 저장한다.   
```java
public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Glide.with(holder.itemView)
                .load(arrayList.get(position).getImage())
                .into(holder.imageView);
        holder.tv_name.setText(arrayList.get(position).getCafename());
        holder.tv_price.setText(String.valueOf(arrayList.get(position).getPrice()));
        holder.tv_drinkname.setText(arrayList.get(position).getDrinkname());
        holder.tv_textprice.setText(arrayList.get(position).getTextprice());
        //  holder.zzim.setText(arrayList.get(position).getFav());
    }
```

* build.gradle > Module:app에 다음 코드를 추가한다.
```
implementation 'com.github.bumptech.glide:glide:4.10.0'
annotationProcessor 'com.github.bumptech.glide:compiler:4.10.0'
```


* price는 int 반환형으로 변수를 받아왔기 때문에 String.valueOf를 사용한다.   
* imageview와 textview 객체를 선언하고 각각의 레이아웃 view를 참조한다.
```java
public int getItemCount() {
        return (arrayList != null ? arrayList.size() :0);
    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tv_name;
        TextView tv_price;
        TextView tv_drinkname;
        TextView tv_textprice;
        // Button zzim;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            this.imageView = itemView.findViewById(R.id.image_drink);
            this.tv_name = itemView.findViewById(R.id.textView_name);
            this.tv_price = itemView.findViewById(R.id.textView_price);
            this.tv_textprice = itemView.findViewById(R.id.textView_price);
            this.tv_drinkname = itemView.findViewById(R.id.textView_drinkname);
            // this.zzim = itemView.findViewById(R.id.zzim);

        }

    }
```



#### AmericanoFragment.java

* 필요한 객체들을 선언한다.   
* Firebase의 DB를 선언한다.
```java
public class AmericanoFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Drink> arrayList;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    TextView textView;
    Query query;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
```


* 한 줄에 3개의 아이템을 띄울 것이기 때문에 GridLayoutManager를 사용해 spanCount를 3으로 설정해준다.
```java
public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_caffe_latte_all, container, false);

        recyclerView = view.findViewById(R.id.drink_recyclerview);
        recyclerView.setHasFixedSize(true);//리사이클러뷰 성능 강화
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        arrayList = new ArrayList<>(); //Drink 객체를 담을 리스트

        database = FirebaseDatabase.getInstance();

        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),3);
        recyclerView.setLayoutManager(layoutManager);
```


* Query를 사용하여 데이터베이스의 특정 부분에 대한 데이터만 불러온다.   
* "Americano"테이블의 자식 테이블인 "Ame"테이블의 데이터들을 price값에 따라 올림차순으로 정렬한다.   
* - onDataChange() 메서드에서 Drink 클래스 객체의 데이터를 받아 저장한다.   
* - DrinkAdapter 객체를 선언하고 리사이클러뷰에 adapter를 저장한다.   
* orderBychild() 메서드는 지정된 하위 키 또는 중첩된 하위 경로의 값에 따라 경과를 정렬하는 데이터 정렬 메서드이다.   
* 버튼을 하나 생성하여 “가격순”으로 음료들을 나열함 -> PopupMenu를 설정해 메뉴버튼으로 만들어준다.
```java
 query =FirebaseDatabase.getInstance().getReference().child("Americano").child("Ame").orderByChild("price");
        // databaseReference = database.getReference("Latte");//DB 테이블 연결
        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // 파이어베이스 데이터베이스의 데이터를 받아옴
                arrayList.clear(); //기존 배열 초기화
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    Drink drink = snapshot.getValue(Drink.class);//드링크 객체의 데이터를 담는다.
                    arrayList.add(drink);
                }
                adapter.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                // db가져오던 중 에러 발생 시
                Log.e("CaffeLatteAllFragment", String.valueOf(databaseError.toException()));

            }
        });

        adapter = new DrinkAdapter(arrayList, getContext());
        recyclerView.setAdapter(adapter); //리사이클러뷰에 어댑터 연결
```


* menu 레이아웃을 하나 생성하고 팝업메뉴에 들어갈 아이템들을 만든다.   
* inflater를 사용하여 생성한 레이아웃을 참조한다.
```java
final Button btn = (Button)view.findViewById(R.id.listbutton);

        btn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                PopupMenu popup = new PopupMenu(getContext(),v);

                popup.getMenuInflater().inflate(R.menu.pricelist_option,popup.getMenu());
```


* 팝업메뉴 버튼에 ClickEvent를 달고 버튼이 눌렸을 시 query를 사용해

원하는 테이블의 데이터들을 가격순으로 정렬하도록 한다.   
```java
popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu1:
                                btn.setText("가격순");
                                query =FirebaseDatabase.getInstance().getReference().child("Americano").child("Ame").orderByChild("price");
                                // adapter.notifyDataSetChanged();
                                query.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                        // 파이어베이스 데이터베이스의 데이터를 받아옴
                                        arrayList.clear(); //기존 배열 초기화
                                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                                            Drink drink = snapshot.getValue(Drink.class);//드링크 객체의 데이터를 담는다.
                                            arrayList.add(drink);
                                        }
                                        adapter.notifyDataSetChanged();
                                    }
                                    @Override
                                    public void onCancelled(@NonNull DatabaseError databaseError) {
                                        // db가져오던 중 에러 발생 시
                                        Log.e("CafeLatteActivity", String.valueOf(databaseError.toException()));
                                    }
                                });
                                adapter = new DrinkAdapter(arrayList, getContext());
                                recyclerView.setAdapter(adapter); //리사이클러뷰에 어댑터 연결
                                break;
                            default:
                                break;
                        }

                        return false;
                    }
                });
                popup.show();
            }
        });
```


* Firebase에서 콜드브루 테이블의 데이터만 받아오는 query이다.
```java
query =FirebaseDatabase.getInstance().getReference().child("Americano").child("Coldbrew").orderByChild("price");
```



#### activity_drink.xml
* 음료 종류를 표시해주는 탭 레이아웃과 Viewpager를 설정해준다.
```java
 <HorizontalScrollView
        android:id="@+id/scrollView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:fillViewport="true"
        >

        <com.google.android.material.tabs.TabLayout
            android:id="@+id/tab_layout"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:tabIndicatorAnimationDuration="300">

        </com.google.android.material.tabs.TabLayout>


    </HorizontalScrollView>

    <androidx.viewpager.widget.ViewPager
        android:id='@+id/viewPager'
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```

* 이 Viewpager에는 음료 아이템들을 띄운다.


![image](https://user-images.githubusercontent.com/62926717/85392448-803dcb80-b586-11ea-9386-80f486ff0a16.png)

![image](https://user-images.githubusercontent.com/62926717/85392464-86cc4300-b586-11ea-9ce6-a4ca3994a656.png)



#### drink_item.xml
* 음료 아이템을 띄우며 이미지, 카페이름, 음료이름, 가격을 띄우는 ImageView와 TextView들이 있다.   
* 이미지는 CardView 안에 정의한다.   
* 전체적인 레이아웃은 LinearLayout으로 정의한다.

```java
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    app:cardCornerRadius="5dp"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:orientation="vertical">

        <androidx.cardview.widget.CardView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:cardCornerRadius="4dp">

            <ImageView
                android:id="@+id/image_drink"
                android:layout_width="120dp"
                android:layout_gravity="center"
                android:layout_height="120dp"
                />

        </androidx.cardview.widget.CardView>
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:layout_margin="5dp"
            android:orientation="vertical">

            <TextView
                android:id="@+id/textView_name"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:textSize="11dp"
                android:textColor="#000099"
                android:gravity="start"
                android:layout_gravity="left"
                />

            <TextView
                android:id="@+id/textView_drinkname"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:textSize="12dp"
                android:layout_gravity="left"
                />

            <TextView
                android:id="@+id/textView_price"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:textSize="17dp"
                android:layout_gravity="left"
                />

        </LinearLayout>
    </LinearLayout>
</LinearLayout>
```


![image](https://user-images.githubusercontent.com/62926717/85392654-ce52cf00-b586-11ea-99f3-7914685f8207.png)

![image](https://user-images.githubusercontent.com/62926717/85392678-d743a080-b586-11ea-8354-087c8e6aeedf.png)



***

### 검색 카테고리 (음료 필터 검색)


#### ListViewItem.java

* iconDrawable은 이미지, title은 음료이름, desc은 카페이름이며 price는 가격이다.   
* ListView의 아이템에 표시될 데이터 클래스를 정의한다.    
* 이미지, 함수 아이템에 get/set 메소드를 지정해준다.


```java
private Drawable iconDrawable ;
    private String titleStr ;
    private String descStr ;
    private String priceStr;

    public Drawable getIcon() {
        return this.iconDrawable ;
    }
    public void setIcon(Drawable icon) {
        iconDrawable = icon ;
    }

    public String getTitle() {
        return this.titleStr ;
    }
    public void setTitle(String title) {
        titleStr = title ;
    }

    public String getDesc() {
        return this.descStr ;
    }
    public void setDesc(String desc) {
        descStr = desc ;
    }

    public String getPriceStr() {
        return  this.priceStr ;
    }
    public void setPriceStr(String price) {
        priceStr=price ;
    }
```



#### listview_item.xml

* ListView 아이템에 대한 화면을 구성한다.


```java
<LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <ImageView
            android:id="@+id/imageView1"
            android:layout_width="149dp"
            android:layout_height="80dp"
            android:layout_weight="3" />

        <LinearLayout
            android:orientation="vertical"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="4">

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="New Text"
                android:id="@+id/textView1"
                android:textSize="24dp"
                android:textColor="#000000"
                android:gravity="center_vertical"
                android:layout_weight="2" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="New Text"
                android:id="@+id/textView2"
                android:textSize="16dp"
                android:textColor="#666666"
                android:layout_weight="1" />
            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="New Text"
                android:id="@+id/textView3"
                android:textSize="16dp"
                android:textColor="#666666"
                android:layout_weight="1" />
        </LinearLayout>

    </LinearLayout>
```



#### ListViewAdapter.java

Adapter가 필터링 기능을 사용할 수 있게 하기위한 필수조건은

Filterable 인터페이스를 implements 해야한다.

Filterable 인터페이스는 필터링 기능이 필요한 곳에서 사용된다.

* Filterable 인터페이스를 구현한다.


```java
public class ListViewAdapter extends BaseAdapter implements Filterable {
    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<ListViewItem> listViewItemList = new ArrayList<ListViewItem>();
    // 필터링된 결과 데이터를 저장하기 위한 ArrayList
    private ArrayList<ListViewItem> filteredItemList = listViewItemList;

    Filter listFilter;


    public ListViewAdapter() {
    }
```


* Adapter에 사용되는 데이터의 갯수를 리턴해준다.
```java
@Override
    public int getCount() {
        return filteredItemList.size();
    }
```


* position에 위치한 데이터를 화면에 출력하는데 사용될 View를 리턴한다.    


```java
@Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();
```

* listview_item.xml의 Layout을 inflate   
* inflate는 xml로 정의된 view를 객체화 시킨다는 뜻이다.
```java
if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_item, parent, false);
        }
```


* 화면에 표시될(Layout이 inflate된) View로 부터 위젯에 대한 참조를 획득한다.
```java
        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.imageView1) ;
        TextView titleTextView = (TextView) convertView.findViewById(R.id.textView1) ;
        TextView descTextView = (TextView) convertView.findViewById(R.id.textView2) ;
        TextView pirceTextView = (TextView) convertView.findViewById(R.id.textView3) ;
```


* filteredItemList에서 position에 위치한 데이터를 받아온다.


```java
ListViewItem listViewItem = filteredItemList.get(position);
```


* 아이템 안에 데이터를 각 위젯에 반영한다.


```java
iconImageView.setImageDrawable(listViewItem.getIcon());
        titleTextView.setText(listViewItem.getTitle());
        descTextView.setText(listViewItem.getDesc());
        pirceTextView.setText(listViewItem.getPriceStr());

        return convertView;
    }
```


* 지정한 위치(position)에 있는 데이터와 관계된 아이템을 가져온다.


```java
@Override
    public long getItemId(int position) {
        return position;
    }
```


* 지정한 위치(position)에 있는 데이터를 받아온다.
```java
@Override
    public Object getItem(int position) {
        return filteredItemList.get(position);
    }
```


* 아이템 데이터를 추가하기 위해 함수를 추가한다.


```java
public void addItem(Drawable icon, String title, String desc, String price) {
        ListViewItem item = new ListViewItem();

        item.setIcon(icon);
        item.setTitle(title);
        item.setDesc(desc);
        item.setPriceStr(price);

        listViewItemList.add(item);
    }
```

* 위에서 Filterable 인터페이스를 implements 했으므로, Filterable 인터페이스의 getFilter() 함수를 오버라이드 한다.
```java
public Filter getFilter() {
        if (listFilter == null) {
            listFilter = new ListFilter();
        }

        return listFilter;
    }
```


* Filter클래스의 역할에 따라, 커스텀 Adapter 내부에 커스텀 Filter 클래스를 정의하고 구현한다.


```java
private class ListFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults() ;

            if (constraint == null || constraint.length() == 0) {
                results.values = listViewItemList ;
                results.count = listViewItemList.size() ;
            } else {
                ArrayList<ListViewItem> itemList = new ArrayList<ListViewItem>() ;

                for (ListViewItem item : listViewItemList) {

                    if (item.getTitle().toUpperCase().contains(constraint.toString().toUpperCase()) ||
                            item.getDesc().toUpperCase().contains(constraint.toString().toUpperCase()))
                    {
                        itemList.add(item) ;
                    }
                }

                results.values = itemList ;
                results.count = itemList.size() ;
            }
            return results;
        }
```



* 이렇게 Adapter 클래스 구현 끝


```java
@Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            filteredItemList=(ArrayList<ListViewItem>)results.values;

            if(results.count>0){
                notifyDataSetChanged();
            }
            else{
                notifyDataSetInvalidated();
            }
        }
    }
}
```




#### drink_search.xml

* ListView의 "textFilterEnabled"속성을 "true"로 지정해줘야한다.    
* 지정해줘야만 setFilterText() 함수를 사용해 필터링 기능을 사용할 수 있다.


```java
<TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="26sp"
        android:layout_marginRight="8dp"
        android:id="@+id/textView1"
        android:text="Filter Text" />

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_toRightOf="@id/textView1"
        android:id="@+id/editTextFilter"/>

    <ListView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_below="@id/editTextFilter"
        android:textFilterEnabled="true"
        android:id="@+id/listview1"/>
```



#### PersonFragment.java
* 위에서 정의한 Adapter를 생성하여 ListView에 지정하는 코드를 작성한다.


```java
public class PersonFragment extends Fragment {
    ListView listView=null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.drink_search, container, false);

        ListViewAdapter adapter;

        //Adapter 생성
        adapter=new ListViewAdapter();

        //리스트뷰 참조 및 adapter 달기
        listView=(ListView)view.findViewById(R.id.listview1);
        listView.setAdapter(adapter);
```


* 작성 전에, 밑의 사진처럼 이미지 데이터를 추가해야 한다.    
* ListView 아이템의 ImageView에 들어갈 이미지를 res > drawable에 추가한다.
<img width="600" height="300" alt="drawable" src="https://user-images.githubusercontent.com/62926717/85353425-2831a580-b543-11ea-99cb-271af1448e48.PNG">



* 추가한 데이터를 형식에 맞게끔 호출해준다.
```java
adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus1),
                "아메리치노 흑당라떼", "엔제리너스", "6200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus2),
                "아메리치노 흑당", "엔제리너스", "5400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus3),
                "오트밀 라떼", "엔제리너스", "5400") ;
```


* EditText를 통해 ListView의 아이템을 필터링 할 텍스트를 입력받은 다음    
* ListView의 setFilterText() 함수를 호출해 필터링을 수행하도록 한다.


```java
EditText editTextFilter=(EditText)view.findViewById(R.id.editTextFilter);
        editTextFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable edit) {
                String filterText=edit.toString();
                ((ListViewAdapter)listView.getAdapter()).getFilter().filter(filterText);
            }
        });
```

***

### 구현 사진

#### 어플 첫 화면
![image](https://user-images.githubusercontent.com/62926717/85406011-22b47980-b59c-11ea-88b7-f1a14a7250a3.png)

#### 홈 카테고리
![KakaoTalk_20200623_211446340_01](https://user-images.githubusercontent.com/62926717/85405089-dae12280-b59a-11ea-8c4d-0a7290263a0f.jpg)

##### 홈 카테고리 - 지도
![KakaoTalk_20200623_211446340_02](https://user-images.githubusercontent.com/62926717/85405182-f9dfb480-b59a-11ea-8322-cf8c16ea4444.jpg)

* 내 위치 주변의 cafe 검색

![KakaoTalk_20200623_211446340_04](https://user-images.githubusercontent.com/62926717/85405227-0d8b1b00-b59b-11ea-9475-e5cbecb0b2ff.jpg)


##### 홈 카테고리 - 추천음료
![Honeycam 2020-06-23 20-35-59](https://user-images.githubusercontent.com/62926717/85405300-2a275300-b59b-11ea-8257-f1ec85c808a6.gif)


#### 프랜차이즈 카테고리 
![KakaoTalk_20200623_211446340_05](https://user-images.githubusercontent.com/62926717/85405358-45925e00-b59b-11ea-8da2-3768396a6e05.jpg)
![KakaoTalk_20200623_211446340_06](https://user-images.githubusercontent.com/62926717/85405417-58a52e00-b59b-11ea-8a9c-cc08edf85095.jpg)


![KakaoTalk_20200623_211446340_07](https://user-images.githubusercontent.com/62926717/85405512-7d010a80-b59b-11ea-80fb-c2a048ca5fba.jpg)



#### 음료 카테고리
![KakaoTalk_20200623_211446340_09](https://user-images.githubusercontent.com/62926717/85405545-88eccc80-b59b-11ea-8a11-98049fd40add.jpg)
![KakaoTalk_20200623_211446340_10](https://user-images.githubusercontent.com/62926717/85405574-9904ac00-b59b-11ea-93a7-8c37ea147a04.jpg)

![KakaoTalk_20200623_211446340_11](https://user-images.githubusercontent.com/62926717/85405650-b46fb700-b59b-11ea-8402-409aabff33be.jpg)

![KakaoTalk_20200623_211446340_12](https://user-images.githubusercontent.com/62926717/85405726-cc473b00-b59b-11ea-9371-9fcb281f9ca1.jpg)


* HOT Tab


![KakaoTalk_20200623_211446340_13](https://user-images.githubusercontent.com/62926717/85405757-d6693980-b59b-11ea-9885-488bbaa112e1.jpg)


![KakaoTalk_20200623_211446340_14](https://user-images.githubusercontent.com/62926717/85405819-e84adc80-b59b-11ea-999a-63c8b65461d8.jpg)


#### 검색 카테고리

![KakaoTalk_20200623_211446340_15](https://user-images.githubusercontent.com/62926717/85405876-fa2c7f80-b59b-11ea-936c-cccf302df910.jpg)

* 동일한 음료만 필터링으로 검색 결과를 나타냄


![KakaoTalk_20200623_211446340_17](https://user-images.githubusercontent.com/62926717/85405917-057fab00-b59c-11ea-85ab-dcd1fd12e09a.jpg)

* 프랜차이즈 이름으로도 검색 가능


![KakaoTalk_20200623_211446340_18](https://user-images.githubusercontent.com/62926717/85405960-10d2d680-b59c-11ea-8736-ac491bdcb68c.jpg)

***

### 맡은 부분

```
201821093 한재현
: 지도, 검색 카테고리, Firebase DB연동/추가
```
```
201821095 홍재원
: 지도, 홈 카테고리, Firebase DB연동/추가
```
```
201821097 황희원
: 지도, 네비게이션 바, 프랜차이즈&음료 카테고리, Firebase DB연동/추가
```
***

### 개선 방안
* Firebase와 연동되지 않아 결국 연결에 실패한 찜 기능이 있다면 자신이 좋아하는 음료를 찜 목록에 넣을 수 있다.   
* 지도에서 최근 검색한 위치를 받아오지 못했다.    
* 음료 정보 Fragment를 구현하려고 했으나, 4000개의 음료마다 Fragment를 하나하나 만들어야해서 넣지 못했다.

***

# 감사합니다 :
