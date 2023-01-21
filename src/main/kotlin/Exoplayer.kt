//import androidx.compose.desktop.Window
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.material.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.sun.jndi.toolkit.url.Uri
//
//@Composable
//fun ExoPlayer() {
//    val context = LocalContext.current
//    val url = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/Sintel.mp4"
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(50.dp)
//                ,
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ) {
//            Text(
//                text = "ExoPlayer Video",
//                color = Color.White,
//                fontWeight = FontWeight.Bold,
//                fontSize = 20.sp
//            )
//        }
//
//        val exoPlayer = remember(context) {
//            SimpleExoPlayer.Builder(context).build().apply {
//                val dataSourceFactory: DataSource.Factory = DefaultDataSourceFactory(
//                    context, Util.getUserAgent(context, context.packageName)
//                )
//
//                val source = ProgressiveMediaSource.Factory(dataSourceFactory)
//                    .createMediaSource(Uri.parse(url))
//
//                this.prepare(source)
//            }
//        }
//        Column(
//            modifier = Modifier
//                .fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ) {
//            Window (
//                factory = { context ->
//                    PlayerView(context).apply {
//                        player = exoPlayer
//                    }
//                }
//            )
//        }
//    }
//}
