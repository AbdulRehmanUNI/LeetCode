import { Text, SafeAreaView, StyleSheet,View,Image,ImageBackground,TextInput,Button,Modal } from 'react-native';
import Header from './components/Header'
import Login from './components/Login'
import Footer from './components/Footer'
import List from './components/List'
import SectionList1 from './components/SectionList'

// You can import supported modules from npm
import { Card } from 'react-native-paper';


export default function App() {
 
  return (
   <View style={styles.container}>
   
   <Header/>
   <List/> 
   <Footer/> 
   
   </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    backgroundColor: '#ecf0f1',
   
  }
});
