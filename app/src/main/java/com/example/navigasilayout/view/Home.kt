package com.example.navigasilayout.view

@Composable
fun Home(
    onSubmitClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF3E5F5))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = "Selamat Datang",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6200EE)
        )
        Spacer(modifier = Modifier.height(40.dp))
        Image(
            painter = painterResource(id = R.drawable.stravaHM),
            contentDescription = "Logo Strava",
            modifier = Modifier.size(150.dp)
        )
        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Pascal Pahlevi Pasha",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "20250140001",
            fontSize = 18.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = onSubmitClick,
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF6200EE)
            ),
            modifier = Modifier.padding(horizontal = 32.dp)
        ){
            Text(
                text = "Submit",
                modifier = Modifier.padding(vertical = 8.dp),
                fontSize = 16.sp
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun HomePreview() {
    Home(onSubmitClick = {})
}
