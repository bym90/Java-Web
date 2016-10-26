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
                            zoom: 12, // ������ ����� ���� �� ũ��
                            mapTypeId: google.maps.MapTypeId.ROADMAP
                        };
         
         
        var map = new google.maps.Map(document.getElementById("map-canvas"), // div�� id�� ���� ���ƾ� ��. "map-canvas"
                                    mapOptions);
         
        var size_x = 40; // ��Ŀ�� ����� �̹����� ���� ũ��
        var size_y = 40; // ��Ŀ�� ����� �̹����� ���� ũ��
     
        // ��Ŀ�� ����� �̹��� �ּ�
        var image = new google.maps.MarkerImage( '�ּ� ���⿡ ����!',
                                                    new google.maps.Size(size_x, size_y),
                                                    '',
                                                    '',
                                                    new google.maps.Size(size_x, size_y));
         
        // Geocoding *****************************************************
        var address = ['���ȱ�', '���ȱ�']; // DB���� �ּ� �����ͼ� �˻��ϰų� ���ʰ� ���� �ּҸ� �ٷ� �ڵ�.
        var content = ['���ȱ�����', '���ȱ�����'];
        var marker = null;
        var geocoder = new google.maps.Geocoder();

        var infowindow = new google.maps.InfoWindow({'content': content[i]});
        
        
        for(var i=0; i<address.length; i++){
        geocoder.geocode( { 'address': address[i]}, function(results, status) {
            if (status == google.maps.GeocoderStatus.OK) {
                map.setCenter(results[0].geometry.location);
                marker = new google.maps.Marker({
                                map: map,
                                icon: image, // ��Ŀ�� ����� �̹���(����)
                          //      title: '�ѹ絵����', // ��Ŀ�� ���콺 ����Ʈ�� ���ٴ��� �� �ߴ� Ÿ��Ʋ
                                position: results[0].geometry.location
                            });
 
             
                // ��Ŀ�� Ŭ������ ���� �̺�Ʈ. ��ǳ�� ��~
               
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