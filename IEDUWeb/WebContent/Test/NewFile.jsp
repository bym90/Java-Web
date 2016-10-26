<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<HTML lang="kr">
<head>
	<META charset="UTF-8">
	<TITLE>Document</TITLE>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDJyqdb8LENaY4ZVBytETkTAVPt0Rrpkos&sensor=false"></script>
<script type="text/javascript">
    function initialize() {
     
        var mapOptions = {
                            zoom: 12, // 지도를 띄웠을 때의 줌 크기
                            mapTypeId: google.maps.MapTypeId.ROADMAP
                        };
         
         
        var map = new google.maps.Map(document.getElementById("map-canvas"), // div의 id과 값이 같아야 함. "map-canvas"
                                    mapOptions);
         
        var size_x = 40; // 마커로 사용할 이미지의 가로 크기
        var size_y = 40; // 마커로 사용할 이미지의 세로 크기
     
        // 마커로 사용할 이미지 주소
        var image = new google.maps.MarkerImage( '주소 여기에 기입!',
                                                    new google.maps.Size(size_x, size_y),
                                                    '',
                                                    '',
                                                    new google.maps.Size(size_x, size_y));
         
        // Geocoding *****************************************************
        var address = ['동안구', '만안구']; // DB에서 주소 가져와서 검색하거나 왼쪽과 같이 주소를 바로 코딩.
        var content = ['동안구설명', '만안구설명'];
        var marker = null;
        var geocoder = new google.maps.Geocoder();

        var infowindow = new google.maps.InfoWindow({'content': content[i]});
        
        
        for(var i=0; i<address.length; i++){
        geocoder.geocode( { 'address': address[i]}, function(results, status) {
            if (status == google.maps.GeocoderStatus.OK) {
                map.setCenter(results[0].geometry.location);
                marker = new google.maps.Marker({
                                map: map,
                                icon: image, // 마커로 사용할 이미지(변수)
                          //      title: '한밭도서관', // 마커에 마우스 포인트를 갖다댔을 때 뜨는 타이틀
                                position: results[0].geometry.location
                            });
 
             
                // 마커를 클릭했을 때의 이벤트. 말풍선 뿅~
               
                google.maps.event.addListener(marker, "click", function() {infowindow.open(map, marker);});
            } else {
                alert("Geocode was not successful for the following reason: " + status);
            }
        });
        }
        // Geocoding // *****************************************************
         
    }
    google.maps.event.addDomListener(window, 'load', initialize);
</script>
</HEAD>
<body onload="initialize()">
	<div id="map-canvas" style="width:500px; height:300px;"></div>
</body>
</HTML>