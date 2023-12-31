package com.example.a7minutesworkout

object Constants {
    fun defaultExerciseList() : ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            id = 1,
            "Jumping Jacks",
            R.drawable.jumping_jacks,
            false,
            false
        )
        exerciseList.add(jumpingJacks)

        val wallList = ExerciseModel(2,"wall sit",R.drawable.wall_sit,false,false)
        exerciseList.add(wallList)

        val pushUp = ExerciseModel(3,"Push Up",R.drawable.push_ups,false,false)
        exerciseList.add(pushUp)

        val abdominalCrunch = ExerciseModel(4,"Abdominal Crunch",R.drawable.abdominal_crunches,false,false)
        exerciseList.add(abdominalCrunch)

        val stepUpOnChair =
            ExerciseModel(
                5,
                "Step-Up onto Chair",
                R.drawable.step_up_on_chair,
                false,
                false
            )
        exerciseList.add(stepUpOnChair)

        val squat = ExerciseModel(6, "Squat", R.drawable.squats, false, false)
        exerciseList.add(squat)

        val tricepDipOnChair =
            ExerciseModel(
                7,
                "Tricep Dip On Chair",
                R.drawable.triceps_dips_on_chair,
                false,
                false
            )
        exerciseList.add(tricepDipOnChair)

        val plank = ExerciseModel(8, "Plank", R.drawable.plank, false, false)
        exerciseList.add(plank)

        val highKneesRunningInPlace =
            ExerciseModel(
                9, "High Knees Running In Place",
                R.drawable.high_knee_running_in_place,
                false,
                false
            )
        exerciseList.add(highKneesRunningInPlace)

        val lunges = ExerciseModel(10, "Lunges", R.drawable.lunge, false, false)
        exerciseList.add(lunges)

        val pushupAndRotation =
            ExerciseModel(
                11,
                "Push up and Rotation",
                R.drawable.push_up_rotation,
                false,
                false
            )
        exerciseList.add(pushupAndRotation)

        val sidePlank = ExerciseModel(12, "Side Plank", R.drawable.side_plank, false, false)
        exerciseList.add(sidePlank)

        return exerciseList
    }
}