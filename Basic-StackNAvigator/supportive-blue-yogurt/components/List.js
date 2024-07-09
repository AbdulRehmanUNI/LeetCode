import { Text, SafeAreaView, StyleSheet,View,Image,ImageBackground,TextInput,Button,TouchableOpacity,Modal,FlatList } from 'react-native';


export default function List(){
  const obj = [
    {
      id:1,
      title:'Product1'
    },
    {
      id:2,
      title:'Product2'
    },
    {
      id:3,
      title:'Product3'
    },
      {
      id:1,
      title:'Product1'
    },
    {
      id:2,
      title:'Product2'
    },
    {
      id:3,
      title:'Product3'
    }

  ];


  return(
    <View style={styles.container}>
      <Text style={styles.heading}>List Items</Text>
      <FlatList data={obj} renderItem={({item})=>
      <View style={styles.item}>
      <Text>{item.title}</Text>
      </View>
      } />
      
    </View>
  );

}

const styles = StyleSheet.create({
container:{
  flex:4,
  backgroundColor:'white'
},
heading:{
  fontSize:20,
  fontWeight:'bold',
  alignSelf:'center'
},
item:{
  padding:15,
  backgroundColor:'green',
  borderRadius:15,
  margin:5,
  justifyContent:'center',
  alignItems:'center' 
}
})